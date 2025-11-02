package ex_12072021;

public abstract class Idraulico {
	
	public Idraulico(String matricola, String nome, String cognome, TipiInterventi tipoInterventoEffettuato) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.tipoInterventoEffettuato = tipoInterventoEffettuato;
		numeroInterventiEffettuati = 0;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
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
	public TipiInterventi getTipoInterventoEffettuato() {
		return tipoInterventoEffettuato;
	}
	public void setTipoInterventoEffettuato(TipiInterventi tipoInterventoEffettuato) {
		this.tipoInterventoEffettuato = tipoInterventoEffettuato;
	}
	public void effettuaIntervento(TipiInterventi t) {
		numeroInterventiEffettuati++;
	}
	protected String matricola;
	protected String nome;
	protected String cognome;
	protected TipiInterventi tipoInterventoEffettuato;
	protected int numeroInterventiEffettuati;
}
