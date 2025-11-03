package arresto;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    public void notify(@Observes Arresto a){
        System.out.println(a.getID_arrestato()+" has been updated");
        
        if(a.getNumero_tatuaggi()>10)
            a.setSciamano(Boolean.TRUE);
    }
}
