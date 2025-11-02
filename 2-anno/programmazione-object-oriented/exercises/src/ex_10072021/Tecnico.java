package ex_10072021;

public abstract class Tecnico {
	
	public Tecnico(String matricola, String nome, String cognome) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		numeroIncontri = 0;
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
	
	public int getNumeroIncontri() {
		return numeroIncontri;
	}

	public void setNumeroIncontri(int numeroIncontri) {
		this.numeroIncontri = numeroIncontri;
	}
	public abstract void assisti(Cliente c);
	public abstract String toString();
	protected String matricola;
	protected String nome;
	protected String cognome;
	protected int numeroIncontri;
}
