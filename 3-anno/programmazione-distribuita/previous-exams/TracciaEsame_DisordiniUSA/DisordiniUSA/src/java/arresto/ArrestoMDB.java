package arresto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic", 
    activationConfig = {
        @ActivationConfigProperty(propertyName="acknowledgeMode",propertyValue = "Auto-acknowledge")
})
public class ArrestoMDB implements MessageListener{
    @Inject 
    Event<Arresto> updateEvent;
    
    @Inject @RilascioQualifier
    Event<Arresto> rilascioEvent;
    
    @Inject
    private ArrestoEJB ejb;

    @Override
    public void onMessage(Message msg) {
        try{
            MessageWrapper msgContent = msg.getBody(MessageWrapper.class);
            Integer id = msgContent.getId();
            
            Arresto a = ejb.trovaPerId(id);
            a.setNumero_reati_contenstati(a.getNumero_reati_contenstati() + msgContent.getVariazioneReati());
            a.setNumero_tatuaggi(a.getNumero_tatuaggi()+ msgContent.getVariazioneTatuaggi());
      
            ejb.aggiornaArresto(a);
            updateEvent.fire(a);
            
            if(a.getNumero_reati_contenstati()==0)
                rilascioEvent.fire(a);
        } catch (JMSException ex) {
            Logger.getLogger(ArrestoMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
