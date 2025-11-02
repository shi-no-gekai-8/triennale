package ex_01072021;

public class DistributoreAutomatico {
	public DistributoreAutomatico(String nomeBibita, int quantita) {
		this.nomeBibita = nomeBibita;
		this.quantita = quantita;
		this.gettoni = 0;
	}
	public void compra() {
		quantita--;
		gettoni++;
	}
	public String getNomeBibita() {
		return nomeBibita;
	}
	public void setNomeBibita(String nomeBibita) {
		this.nomeBibita = nomeBibita;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public int getGettoni() {
		return gettoni;
	}
	public void setGettoni(int gettoni) {
		this.gettoni = gettoni;
	}

	private String nomeBibita;
	private int quantita;
	private int gettoni;
}
