package ex_02072021;

public class DataSert {
	
	public DataSert() {
		somma = 0;
		contatore = 0;
		massimo = 0;
	}
	public void addiziona(double x) {
		somma = somma+x;
		if(contatore==0 || massimo < x) {
			massimo = x;
			contatore++;
		}
	}
	public double getMedia() {
		if(contatore==0) {
			return 0;
		}
		return somma/contatore;
	}
	public double getMassimo() {
		return massimo;
	}
	private double somma;
	private double massimo;
	private int contatore;
}
