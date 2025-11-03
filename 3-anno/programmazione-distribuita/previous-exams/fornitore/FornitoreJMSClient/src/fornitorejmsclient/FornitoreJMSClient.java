package fornitorejmsclient;

import fornitore.*;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FornitoreJMSClient {

    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        ConnectionFactory connectionFactory = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic = (Destination) 
                ctx.lookup("jms/javaee7/Topic");
        
        Ordine ordine = new Ordine(98, 42);
        try(JMSContext jmsContext = connectionFactory.createContext()){
            jmsContext.createProducer().setProperty("id", "A1").
                                    send(topic, ordine);
            
            System.out.println("Message sent " + ordine);
        }
        
        ordine = new Ordine(102, 40);
        try(JMSContext jmsContext = connectionFactory.createContext()){
            jmsContext.createProducer().setProperty("id", "A1").
                                    send(topic, ordine);
            
            System.out.println("Message sent " + ordine);
        }    
    }
}