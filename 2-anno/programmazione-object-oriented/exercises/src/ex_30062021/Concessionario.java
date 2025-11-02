package ex_30062021;

public class Concessionario {
	
	public Concessionario(String marca, String nome, String targa, double serbatoio, double autonomiaConUnLitro) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.targa = targa;
		this.serbatoio = serbatoio;
		this.autonomiaConUnLitro = autonomiaConUnLitro;
	}
	public double calcolaAutonomia(double km) {
		double autonomia = km*autonomiaConUnLitro;
		return autonomia;
	}
	
	@Override
	public String toString() {
		return "Concessionario [marca=" + marca + ", nome=" + nome + ", targa=" + targa + ", serbatoio=" + serbatoio
				+ ", autonomiaConUnLitro=" + autonomiaConUnLitro + "]";
	}
	
	public String getNome() {
		return nome;
	}

	private String marca;
	private String nome;
	private String targa;
	private double serbatoio;
	private double autonomiaConUnLitro;
}
