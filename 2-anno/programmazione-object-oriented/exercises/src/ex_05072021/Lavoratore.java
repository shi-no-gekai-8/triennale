package ex_05072021;

public abstract class Lavoratore {
	
	public Lavoratore(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public abstract double calcolaPaga(int ore, double tariffa);
	public abstract int getNumeroOre();
	public abstract double getTariffaOraria();
	protected String nome;
}
