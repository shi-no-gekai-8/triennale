package fornitore;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface FornitoreEJBRemote {
    void aggiungiFornitore(Fornitore f);
    void eliminaFornitore(Fornitore f);
    Fornitore aggiornaFornitore(Fornitore f);
    
    List<Fornitore> trovaTuttiFornitori();
    Fornitore trovaFornitorePerId(String id);
    List<Fornitore> trovaFornitorePerCognome(String cognome);
    List<Fornitore> trovaFornitoriPerMaxordine(int maxOrdine);
}
