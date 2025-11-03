package fornitorestdclient;

import fornitore.*;
import java.util.List;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FornitoreStdClient {

    static final Logger logger = Logger.getLogger(FornitoreStdClient.class.getName());
    
    public static void main(String[] args) throws NamingException {
        
        if(args.length < 1){
            logger.info("Inserire un numero indicante la quantità del massimo ordine");
            System.exit(0);
        }
        
        Context cxt = new InitialContext();
        FornitoreEJBRemote ejb = (FornitoreEJBRemote)
                    cxt.lookup("java:global/FornitoreBean/FornitoreEJB!fornitore.FornitoreEJBRemote");
        
        int maxOrdine = Integer.parseInt(args[0]);
        List<Fornitore> lista = ejb.trovaFornitoriPerMaxordine(maxOrdine);
        
        for (Fornitore f : lista) {
            System.out.println(f.getNomeSoc());
        }
       
    }
    
}
