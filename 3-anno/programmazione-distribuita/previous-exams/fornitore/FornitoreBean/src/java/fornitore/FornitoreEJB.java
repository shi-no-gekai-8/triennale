package fornitore;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
@Loggable
@WebService
public class FornitoreEJB implements FornitoreEJBRemote {
    @Inject
    private EntityManager em;
    
    @Override
    public void aggiungiFornitore(Fornitore f) {
        em.persist(f);
    }

    @Override
    public void eliminaFornitore(Fornitore f) {
        em.remove(em.merge(f));
    }

    @Override
    public Fornitore aggiornaFornitore(Fornitore f) {
        return em.merge(f);
    }

    @Override
    public List<Fornitore> trovaTuttiFornitori() {
        TypedQuery<Fornitore> query = em.createNamedQuery(Fornitore.TROVA_TUTTI, Fornitore.class);
        return query.getResultList();
    }

    @Override
    public Fornitore trovaFornitorePerId(String id) {
        TypedQuery<Fornitore> query = em.createNamedQuery(Fornitore.TROVA_PER_ID, Fornitore.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Fornitore> trovaFornitorePerCognome(String cognome) {
        TypedQuery<Fornitore> query = em.createNamedQuery(Fornitore.TROVA_PER_COGNOME, Fornitore.class);
        query.setParameter("cognome", cognome);
        return query.getResultList();
    }

    @Override
    public List<Fornitore> trovaFornitoriPerMaxordine(int maxOrdine) {
        TypedQuery<Fornitore> query = em.createNamedQuery(Fornitore.TROVA_PER_MAXORDINE, Fornitore.class);
        query.setParameter("max", maxOrdine);
        return query.getResultList();
    }
    
}
