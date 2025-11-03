package arresto;

import javax.ejb.Remote;
import arresto.Arresto;
import java.util.List;

@Remote
public interface ArrestoEJBRemote {
    void aggiungiArresto(Arresto a);
    Arresto aggiornaArresto(Arresto a);
    void rimuoviArresto(Arresto a);
    
    List<Arresto> trovaPerCognome(String cogmone);
    List<Arresto> trovaPerForzaPolizia(String polizia);
    List<Arresto> trovaPerOrganizzazione(String organizzazione);
    List<Arresto> trovaPerTeoriaComplotto(String teoriaComplotto);
    List<Arresto> trovaArresti();
    List<Arresto> trovaPerTatuaggi(int numTatuaggi);
    List<Arresto> trovaSciamani();
    Arresto trovaPerId(int id);
}
