package fornitore;

import java.util.ArrayList;
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
    name = "java:global/jdbc/fornitoreDS",
    user = "app",
    password = "app",
    databaseName = "fornitoreDB",
    properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    private FornitoreEJB fornitoreEJB;
    private ArrayList<Fornitore> lista;
    
    @PostConstruct
    public void popolaDB(){
        lista = new ArrayList<>();
        lista.add(new Fornitore("A1", "Enrica", "Doria", "EL", "3396785743", 100));
        lista.add(new Fornitore("A2", "Sonia", "Tagliafierro", "ST", "3309876384", 300));
        
        for (Fornitore f : lista) 
            fornitoreEJB.aggiungiFornitore(f);
    }
    
    @PreDestroy
    public void pulisciDB(){
        for (Fornitore f : lista) 
            fornitoreEJB.eliminaFornitore(f);        
    }
}

