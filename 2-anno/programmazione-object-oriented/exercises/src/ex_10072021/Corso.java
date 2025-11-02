package ex_10072021;

public abstract class Corso {
	public Corso(String nome, String docente) {
		this.nome = nome;
		this.docente = docente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public abstract double calcolaCosto();
	public abstract int dammiNumeroCFU();
	public abstract int getOre();
	public abstract String toString();
	protected String nome;
	protected String docente;
}
