package ex_13072021;

public abstract class Mostro {
	public Mostro(String nome, double livelloEnergia, double vitalita) {
		this.nome = nome;
		this.livelloEnergia = livelloEnergia;
		this.vitalita = vitalita;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLivelloEnergia() {
		return livelloEnergia;
	}
	public void setLivelloEnergia(double livelloEnergia) {
		this.livelloEnergia = livelloEnergia;
	}
	public double getVitalita() {
		return vitalita;
	}
	public void setVitalita(double vitalita) {
		this.vitalita = vitalita;
	}
	public abstract String toString();
	public abstract boolean equals(Object obj);
	public abstract void attacca(Mostro m);
	public abstract void difendi();
	protected String nome;
	protected double livelloEnergia;
	protected double vitalita;
}
