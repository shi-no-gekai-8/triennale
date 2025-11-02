package ex_13072021;

public class TesserinoPersonale extends Tesserino {
	
	public TesserinoPersonale(int codice, String nome, String cognome, String facolta, double sommaSpesa, String categoria) {
		super(codice, nome, cognome);
		this.facolta = facolta;
		this.sommaSpesa = sommaSpesa;
		this.categoria = categoria;
	}
	public String getFacolta() {
		return facolta;
	}
	public void setFacolta(String facolta) {
		this.facolta = facolta;
	}
	public double getSommaSpesa() {
		return sommaSpesa;
	}
	public void setSommaSpesa(double sommaSpesa) {
		this.sommaSpesa = sommaSpesa;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double paga() {
		double costoPasto = 0;
		if(categoria.equalsIgnoreCase("Docente")) {
			costoPasto = 1.6;
			return costoPasto+sommaSpesa;
		}
		costoPasto = 4;
		return costoPasto+sommaSpesa;
	}
	private String facolta;
	private double sommaSpesa;
	private String categoria;
}
