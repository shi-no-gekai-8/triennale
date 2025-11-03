package arresto;

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
   name = "java:global/jdbc/EsameDS",
   user = "ok", password = "ok",
   databaseName = "EsameDB",
   properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private ArrestoEJB ejb;
    private Arresto a1, a2, a3;
    
    @PostConstruct
    private void populateDB(){
        a1 = new Arresto(1, "Angeli", "Jack", "FBI", "QAnon", "Renzi", 3, true, 12);
        a2 = new Arresto(2, "Hope", "Bob", "CIA", "Proud Boys", "Gates", 2, false, 4);
        a3 = new Arresto(3, "Mack", "John", "FBI", "Boogaloo", "Luna", 4, false, 2);
        
        ejb.aggiungiArresto(a1);
        ejb.aggiungiArresto(a2);
        ejb.aggiungiArresto(a3);
    }
    
    @PreDestroy
    private void clearDB(){
        ejb.rimuoviArresto(a1);
        ejb.rimuoviArresto(a2);
        ejb.rimuoviArresto(a3);
    }
    
    
}
