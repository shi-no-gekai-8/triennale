package ricambioautowebclient;

import java.util.Scanner;
import ricambi.RicambioAutoEntity;

public class RicambioAutoWebClient {

    public static void main(String[] args) {
        
        System.out.print("Quale pezzo vuoi modificare?");
        Scanner scanner = new Scanner(System.in);
        Integer id = scanner.nextInt();
        
        System.out.print("Con quale valore?");
        Float prezzo = scanner.nextFloat();
        
        RicambioAutoEntity a = cercaPerId(id);
        a.setPrezzo(prezzo);
        aggiornaRicambioAuto(a);
    }

    private static RicambioAutoEntity cercaPerId(java.lang.Integer arg0) {
        ricambi.RicambioAutoEJBService service = new ricambi.RicambioAutoEJBService();
        ricambi.RicambioAutoEJB port = service.getRicambioAutoEJBPort();
        return port.cercaPerId(arg0);
    }

    private static RicambioAutoEntity aggiornaRicambioAuto(ricambi.RicambioAutoEntity arg0) {
        ricambi.RicambioAutoEJBService service = new ricambi.RicambioAutoEJBService();
        ricambi.RicambioAutoEJB port = service.getRicambioAutoEJBPort();
        return port.aggiornaRicambioAuto(arg0);
    }
    
    
}
