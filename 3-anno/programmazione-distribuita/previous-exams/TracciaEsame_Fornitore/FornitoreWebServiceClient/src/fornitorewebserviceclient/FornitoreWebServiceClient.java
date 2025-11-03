package fornitorewebserviceclient;

import java.util.List;

public class FornitoreWebServiceClient {

     public static void main(String[] args) {        
        List<fornitore.Fornitore> fornitori = trovaTuttiFornitori();
        for(fornitore.Fornitore f: fornitori)
            System.out.println(f.getCognome() + " della " + f.getNomeSoc());
    }

    private static java.util.List<fornitore.Fornitore> trovaTuttiFornitori() {
        fornitore.FornitoreEJBService service = new fornitore.FornitoreEJBService();
        fornitore.FornitoreEJB port = service.getFornitoreEJBPort();
        return port.trovaTuttiFornitori();
    }

    
    

    
}
