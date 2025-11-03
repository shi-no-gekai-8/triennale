package ricambi;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.enterprise.inject.Produces;

public class DatabaseProducer {
    
    @Produces
    @PersistenceContext(unitName = "RicambioAutoPU")
    private EntityManager em;
    
}