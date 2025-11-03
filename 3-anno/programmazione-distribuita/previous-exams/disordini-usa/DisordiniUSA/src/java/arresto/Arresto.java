package arresto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;

import static arresto.Arresto.TROVA_PER_COGNOME;
import static arresto.Arresto.TROVA_PER_FORZA_POLIZIA;
import static arresto.Arresto.TROVA_PER_ORGANIZZAZIONE;
import static arresto.Arresto.TROVA_PER_TEORIA_COMPLOTTO;
import static arresto.Arresto.TROVA_PER_TATUAGGI;
import static arresto.Arresto.TROVA_SCIAMANI;
import static arresto.Arresto.TROVA_TUTTI;
import static arresto.Arresto.TROVA_PER_ID;
import java.io.Serializable;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_COGNOME, query = "SELECT a FROM Arresto a WHERE a.cognome = :cognome"),
    @NamedQuery(name = TROVA_PER_FORZA_POLIZIA, query = "SELECT a FROM Arresto a WHERE a.forza_polizia = :forza_polizia"),
    @NamedQuery(name = TROVA_PER_ORGANIZZAZIONE, query = "SELECT a FROM Arresto a WHERE a.organizzazione = ?1"),
    @NamedQuery(name = TROVA_PER_TEORIA_COMPLOTTO, query = "SELECT a FROM Arresto a WHERE a.teoria_complotto = ?21"),
    @NamedQuery(name = TROVA_PER_TATUAGGI, query = "SELECT a FROM Arresto a WHERE a.numero_tatuaggi < :num_tatuaggi"),
    @NamedQuery(name = TROVA_SCIAMANI, query = "SELECT a FROM Arresto a WHERE a.sciamano = TRUE"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT a FROM Arresto a WHERE a.id = :id"),
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT a FROM Arresto a")  
        
})
public class Arresto implements Serializable{
    public static final String TROVA_PER_COGNOME = "Arresto.trovaPerCognome";
    public static final String TROVA_PER_FORZA_POLIZIA = "Arresto.trovaPerForzaPolizia";
    public static final String TROVA_PER_ORGANIZZAZIONE = "Arresto.trovaPerOrganizzazione";
    public static final String TROVA_PER_TEORIA_COMPLOTTO = "Arresto.trovaPerTeoriaComplotto";
    public static final String TROVA_PER_TATUAGGI = "Arreso.trovaPerTatuaggi";
    public static final String TROVA_TUTTI = "Arresto.trovaTuttiArresti";
    public static final String TROVA_SCIAMANI = "Arresto.trovaSciamani";
    public static final String TROVA_PER_ID = "Arresto.trovaPerID";
    
    @Id
    Integer id;
    String cognome;
    String nome;
    String forza_polizia;
    String organizzazione;
    String teoria_complotto;
    Integer numero_reati_contenstati;
    Boolean sciamano;
    Integer numero_tatuaggi;

    public Arresto() {
    }

    public Arresto(Integer ID_arrestato, String cognome, String nome, String forza_polizia, String organizzazione, String teoria_complotto, Integer numero_reati_contenstati, Boolean sciamano, Integer numero_tatuaggi) {
        this.id = ID_arrestato;
        this.cognome = cognome;
        this.nome = nome;
        this.forza_polizia = forza_polizia;
        this.organizzazione = organizzazione;
        this.teoria_complotto = teoria_complotto;
        this.numero_reati_contenstati = numero_reati_contenstati;
        this.sciamano = sciamano;
        this.numero_tatuaggi = numero_tatuaggi;
    }

    public Integer getID_arrestato() {
        return id;
    }

    public void setID_arrestato(Integer ID_arrestato) {
        this.id = ID_arrestato;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getForza_polizia() {
        return forza_polizia;
    }

    public void setForza_polizia(String forza_polizia) {
        this.forza_polizia = forza_polizia;
    }

    public String getOrganizzazione() {
        return organizzazione;
    }

    public void setOrganizzazione(String organizzazione) {
        this.organizzazione = organizzazione;
    }

    public String getTeoria_complotto() {
        return teoria_complotto;
    }

    public void setTeoria_complotto(String teoria_complotto) {
        this.teoria_complotto = teoria_complotto;
    }

    public Integer getNumero_reati_contenstati() {
        return numero_reati_contenstati;
    }

    public void setNumero_reati_contenstati(Integer numero_reati_contenstati) {
        this.numero_reati_contenstati = numero_reati_contenstati;
    }

    public Boolean getSciamano() {
        return sciamano;
    }

    public void setSciamano(Boolean sciamano) {
        this.sciamano = sciamano;
    }

    public Integer getNumero_tatuaggi() {
        return numero_tatuaggi;
    }

    public void setNumero_tatuaggi(Integer numero_tatuaggi) {
        this.numero_tatuaggi = numero_tatuaggi;
    }

    @Override
    public String toString() {
        return "Arresto{" + "ID_arrestato=" + id + ", cognome=" + cognome + ", nome=" + nome + ", forza_polizia=" + forza_polizia + ", organizzazione=" + organizzazione + ", teoria_complotto=" + teoria_complotto + ", numero_reati_contenstati=" + numero_reati_contenstati + ", sciamano=" + sciamano + ", numero_tatuaggi=" + numero_tatuaggi + '}';
    }
    
    
}
