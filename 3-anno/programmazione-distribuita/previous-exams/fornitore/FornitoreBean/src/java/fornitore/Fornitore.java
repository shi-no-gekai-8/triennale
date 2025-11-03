package fornitore;

import static fornitore.Fornitore.TROVA_PER_COGNOME;
import static fornitore.Fornitore.TROVA_PER_ID;
import static fornitore.Fornitore.TROVA_PER_MAXORDINE;
import static fornitore.Fornitore.TROVA_TUTTI;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT f FROM Fornitore f"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT f FROM Fornitore f WHERE f.id = :id"),
    @NamedQuery(name = TROVA_PER_COGNOME, query = "SELECT f FROM Fornitore f WHERE f.cognome = :cognome"),
    @NamedQuery(name = TROVA_PER_MAXORDINE, query = "SELECT f FROM Fornitore f WHERE f.maxOrdine >= :max")
})
@XmlRootElement
public class Fornitore implements Serializable{
    
    public static final String TROVA_TUTTI = "Fornitore.trovaTutti";
    public static final String TROVA_PER_ID = "Fornitore.trovaPerId";
    public static final String TROVA_PER_COGNOME = "Fornitore.trovaPerCognome";
    public static final String TROVA_PER_MAXORDINE = "Fornitore.trovaPerMaxOrdine";
    
    @Id
    private String id;
    private String nome;
    private String cognome;
    private String nomeSoc;
    private String telefono;
    private int maxOrdine;
    private float valoreTotaleOrdini;

    public Fornitore() {
    }

    public Fornitore(String id, String nome, String cognome, String nomeSoc, String telefono, int maxOrdine) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.nomeSoc = nomeSoc;
        this.telefono = telefono;
        this.maxOrdine = maxOrdine;
        this.valoreTotaleOrdini = 0f;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNomeSoc() {
        return nomeSoc;
    }

    public void setNomeSoc(String nomeSoc) {
        this.nomeSoc = nomeSoc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getMaxOrdine() {
        return maxOrdine;
    }

    public void setMaxOrdine(int maxOrdine) {
        this.maxOrdine = maxOrdine;
    }

    public float getValoreTotaleOrdini() {
        return valoreTotaleOrdini;
    }

    public void setValoreTotaleOrdini(float valoreTotaleOrdini) {
        this.valoreTotaleOrdini = valoreTotaleOrdini;
    }
    
    public boolean incrementaTotaleOrdini(Float valoreOrdine, int quantitaOrdine){
        
        if(controllaQuantitaOrdine(quantitaOrdine)){
            this.valoreTotaleOrdini += valoreOrdine;
            return true;
        }
        return false;
        
    }
    
    private boolean controllaQuantitaOrdine(int quantitaOrdine){
        return (quantitaOrdine <= this.maxOrdine);
    }
    
}
