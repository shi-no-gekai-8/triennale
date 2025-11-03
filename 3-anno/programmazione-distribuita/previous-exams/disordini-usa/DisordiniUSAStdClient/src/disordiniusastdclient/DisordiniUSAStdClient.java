package disordiniusastdclient;

import arresto.*;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class DisordiniUSAStdClient {
    private static ArrestoEJBRemote ejb;
    
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        
        ejb = (ArrestoEJBRemote) ctx.lookup("java:global/DisordiniUSA/ArrestoEJB!arresto.ArrestoEJBRemote");
        
        List<Arresto> sciamani = ejb.trovaSciamani();
        System.out.println("SCIAMANI");
        for(Arresto a : sciamani)
            System.out.println(a);
        
        String organizzazione = "QAnon";
        System.out.println("ARRESTATI DELL'ORGANIZZAZIONE " + organizzazione);
        List<Arresto> arresti = ejb.trovaPerOrganizzazione(organizzazione);
        for(Arresto a : arresti)
            System.out.println(a);
        
        Integer tatuaggi = 10;
        System.out.println("ARRESTATI CON MENO DI " + tatuaggi + " TATUAGGI");
        arresti = ejb.trovaPerTatuaggi(tatuaggi);
        for(Arresto a : arresti)
            System.out.println(a);
        
    }
    
}
