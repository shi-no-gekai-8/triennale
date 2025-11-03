package arresto;

import javax.enterprise.event.Observes;

public class RilascioNotification {
    public void notify(@Observes @RilascioQualifier Arresto a){
        System.out.println(a.getCognome() + " " + a.getNome() + " può essere lasciato");
    }
}
