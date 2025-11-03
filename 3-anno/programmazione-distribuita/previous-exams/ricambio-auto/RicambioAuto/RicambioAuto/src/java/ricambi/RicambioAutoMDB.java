package ricambi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class RicambioAutoMDB implements MessageListener {
    
    @Inject
    private RicambioAutoEJB ricambiejb;

    @Inject 
    Event<RicambioAutoEntity> event;
    
    @Override
    public void onMessage(Message msg) {
        try {
            MessageWrapper wrapper = msg.getBody(MessageWrapper.class);
            
            Integer id = wrapper.getId();
            Integer itemsSold = wrapper.getPezzi_venduti();
            
            RicambioAutoEntity a = ricambiejb.cercaPerId(id);
            a.setPezziVenduti(a.getPezziVenduti()+itemsSold);
            //a = ricambiejb.aggiornaRicambioAuto(a);
            
            event.fire(a);
        } catch (JMSException ex) {
            Logger.getLogger(RicambioAutoMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}