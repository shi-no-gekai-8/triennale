package ricambi;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@WebService
@Stateless
@Counter
@LocalBean
public class RicambioAutoEJB implements RicambioAutoEJBRemote {
    @Inject 
    private EntityManager em;
    
    @Override
    public void aggiungiRicambioAuto(RicambioAutoEntity a) {
        em.persist(a);
    }

    @Override
    public void rimuoviRicambioAuto(RicambioAutoEntity a) {
        em.remove(em.merge(a));
    }

    @Override
    public RicambioAutoEntity aggiornaRicambioAuto(RicambioAutoEntity a) {
        return em.merge(a);
    }

    @Override
    public List<RicambioAutoEntity> cercaTuttiRicambioAuto() {
        TypedQuery<RicambioAutoEntity> query = em.createNamedQuery(RicambioAutoEntity.TROVA_TUTTI, RicambioAutoEntity.class);
        return query.getResultList();
    }
    
    @Override
    public List<RicambioAutoEntity> cercaArticoliDaOrdinare() {
        TypedQuery<RicambioAutoEntity> query = em.createNamedQuery(RicambioAutoEntity.TROVA_ARTICOLI_DA_ORDINARE, RicambioAutoEntity.class);
        return query.getResultList();
    }

    @Override
    public RicambioAutoEntity cercaPerId(Integer id) {
        TypedQuery<RicambioAutoEntity> query = em.createNamedQuery(RicambioAutoEntity.TROVA_PER_ID, RicambioAutoEntity.class);
        query.setParameter(1, id);
        return query.getSingleResult();
    }

    @Override
    public List<RicambioAutoEntity> cercaPerCategoria(String categoria) {
        TypedQuery<RicambioAutoEntity> query = em.createNamedQuery(RicambioAutoEntity.TROVA_PER_CATEGORIA, RicambioAutoEntity.class);
        query.setParameter("categoria", categoria);
        return query.getResultList();
    }

}