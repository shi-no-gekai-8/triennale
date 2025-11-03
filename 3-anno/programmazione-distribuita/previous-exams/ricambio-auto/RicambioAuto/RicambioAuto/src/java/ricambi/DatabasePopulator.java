package ricambi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
   className = "org.apache.derby.jdbc.EmbeddedDataSource",
   name = "java:global/jdbc/RicambioAutoDS",
   user = "ok", password = "ok",
   databaseName = "RicambioAutoDB",
   properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private RicambioAutoEJB ricambioAutoEjb;
    private RicambioAutoEntity ricambio1, ricambio2, ricambio3;
    
    @PostConstruct
    private void populateDB(){
        ricambio1 = new RicambioAutoEntity(1, "Motore", "Sensore Temperatura", 100, 1000, 12.22F);
        ricambio2 = new RicambioAutoEntity(2, "Filtri", "FAP", 9, 1, 188.74F);
        ricambio3 = new RicambioAutoEntity(3, "Freni", "Dischi Freni", 2000, 5000, 18.15F);
        
        ricambioAutoEjb.aggiungiRicambioAuto(ricambio1);
        ricambioAutoEjb.aggiungiRicambioAuto(ricambio2);
        ricambioAutoEjb.aggiungiRicambioAuto(ricambio3);
    }
    
    @PreDestroy
    private void clearDB(){
        ricambioAutoEjb.rimuoviRicambioAuto(ricambio1);
        ricambioAutoEjb.rimuoviRicambioAuto(ricambio2);
        ricambioAutoEjb.rimuoviRicambioAuto(ricambio3);
    }
    
    
}