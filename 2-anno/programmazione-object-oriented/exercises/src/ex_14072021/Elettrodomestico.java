package ex_14072021;

public abstract class Elettrodomestico {
	public Elettrodomestico(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
		this.numeroProgrammi = 0;
		this.acceso = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumeroProgrammi() {
		return numeroProgrammi;
	}
	public void setNumeroProgrammi(int numeroProgrammi) {
		this.numeroProgrammi = numeroProgrammi;
	}
	public abstract void start();
	public abstract void next();
	protected String nome;
	protected String marca;
	protected int numeroProgrammi;
	protected boolean acceso;
}
