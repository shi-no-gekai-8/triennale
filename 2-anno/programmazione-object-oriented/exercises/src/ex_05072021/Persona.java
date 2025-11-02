package ex_05072021;

public class Persona {
	
	public Persona(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	public String toString() {
		return "Persona [nome=" + nome + ", annoNascita=" + annoNascita + "]";
	}
	protected String nome;
	protected int annoNascita;
}
