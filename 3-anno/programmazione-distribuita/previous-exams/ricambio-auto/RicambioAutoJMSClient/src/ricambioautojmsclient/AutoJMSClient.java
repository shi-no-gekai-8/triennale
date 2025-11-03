package ricambioautojmsclient;

import java.util.logging.Level;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import ricambi.MessageWrapper;

public class AutoJMSClient {

    public static void main(String[] args) throws NamingException{
        Context cxt  = new InitialContext();
        ConnectionFactory cf = (ConnectionFactory) cxt.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) cxt.lookup("jms/javaee7/Topic");
                      
        Integer id = 1;
        Integer vendite = 10;
        MessageWrapper wrapper = new MessageWrapper(id, vendite);
        
        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().
                send(topic, wrapper);
            
        }
    }
    
}