package fornitore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(mappedName = "jms/javaee7/Topic")
public class FornitoreMDB implements MessageListener{
    
    @Inject
    FornitoreEJB ejb;

    @Override
    public void onMessage(Message message) {
        
        try {
            String id = message.getStringProperty("id");
            Ordine ordine = message.getBody(Ordine.class);
            
            Fornitore f = ejb.trovaFornitorePerId(id);
            
            if(f.incrementaTotaleOrdini(ordine.getValore(), ordine.getQuantita())){
                ejb.aggiornaFornitore(f);
                System.out.println("Fornitore " + id + " aggiornato");
            }
            else
                System.out.println("Fornitore " + id + " non aggiornato");
            
        } catch (JMSException ex) {
            Logger.getLogger(FornitoreMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
