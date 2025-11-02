package ex_06072021;

public abstract class Personale {
	
	public Personale(String nome, double retribuzione) {
		this.nome = nome;
		this.retribuzione = retribuzione;
	}
	public String toString() {
		return "Nome: "+nome+", Retribuzione: "+retribuzione;
	}
	protected String nome;
	protected double retribuzione;
}
