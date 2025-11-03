package arresto;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class ArrestoEJB implements ArrestoEJBRemote {
    
    @Inject
    private EntityManager em;

    @Override
    public void aggiungiArresto(Arresto a) {
        em.persist(a);
    }

    @Override
    public Arresto aggiornaArresto(Arresto a) {
        return em.merge(a);
    }

    @Override
    public void rimuoviArresto(Arresto a) {
        em.remove(em.merge(a));
    }

    @Override
    public List<Arresto> trovaPerCognome(String cognome) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_COGNOME, Arresto.class);
        q.setParameter("cognome", cognome);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaPerForzaPolizia(String polizia) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_FORZA_POLIZIA, Arresto.class);
        q.setParameter("forza_polizia", polizia);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaPerOrganizzazione(String organizzazione) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_ORGANIZZAZIONE, Arresto.class);
        q.setParameter(1, organizzazione);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaPerTeoriaComplotto(String teoriaComplotto) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_TEORIA_COMPLOTTO, Arresto.class);
        q.setParameter(21, teoriaComplotto);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaArresti() {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_TUTTI, Arresto.class);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaPerTatuaggi(int numTatuaggi) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_TATUAGGI, Arresto.class);
        q.setParameter("num_tatuaggi", numTatuaggi);
        return q.getResultList();
    }

    @Override
    public List<Arresto> trovaSciamani() {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_SCIAMANI, Arresto.class);
        return q.getResultList();
    }

    @Override
    public Arresto trovaPerId(int id) {
        TypedQuery<Arresto> q = em.createNamedQuery(Arresto.TROVA_PER_ID, Arresto.class);
        q.setParameter("id", id);
        return q.getSingleResult();    
    }
     
}
