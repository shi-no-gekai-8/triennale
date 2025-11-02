package ex_01072021;

public class Name {
	
	public Name(String nome, String cognome, Titolo titolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.titolo = titolo;
	}
	public String getIniziali() {
		String inizialeNome = nome.substring(0, 0+1);
		String inizialeCognome = cognome.substring(0, 0+1);
		return inizialeNome+"."+inizialeCognome;
	}
	public String getNomeCognome() {
		return nome+" "+cognome;
	}
	public String getCognomeNome() {
		return cognome+" "+nome;
	}
	
	public void setTitolo(Titolo titolo) {
		this.titolo = titolo;
	}
	@Override
	public String toString() {
		return "Creato: " + titolo + " " + nome + " " + cognome;
	}
	private String nome;
	private String cognome;
	public enum Titolo{
		Signor,
		Signora
	}
	private Titolo titolo;
}
