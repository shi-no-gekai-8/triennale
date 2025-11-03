package ricambi;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    public void notify(@Observes RicambioAutoEntity ricambio){
        System.out.println(ricambio.getId() +" has been updated. Status: " + ricambio);
    }
}