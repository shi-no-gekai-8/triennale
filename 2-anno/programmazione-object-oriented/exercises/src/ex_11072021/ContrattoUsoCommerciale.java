package ex_11072021;

public class ContrattoUsoCommerciale extends Contratto {
	
	public ContrattoUsoCommerciale(String nomeLocatore, String indirizzoMobile, int numeroMetriQuadri, String tipologiaAttivita) {
		super(nomeLocatore, indirizzoMobile);
		locato = false;
		this.numeroMetriQuadri = numeroMetriQuadri;
		this.tipologiaAttivita = tipologiaAttivita;
	}
	
	public double getNumeroMetriQuadri() {
		return numeroMetriQuadri;
	}
	public void setNumeroMetriQuadri(int numeroMetriQuadri) {
		this.numeroMetriQuadri = numeroMetriQuadri;
	}
	public String getTipologiaAttivita() {
		return tipologiaAttivita;
	}
	public void setTipologiaAttivita(String tipologiaAttivita) {
		this.tipologiaAttivita = tipologiaAttivita;
	}
	public double calcolaAffitto() {
		return numeroMetriQuadri*15;
	}
	public double calcolaTasse() {
		if(tipologiaAttivita.equalsIgnoreCase("Alto Impatto Ambientale")) {
			return (numeroMetriQuadri*32)+75;
		}
		return (numeroMetriQuadri*32)+45;
	}
	public String toString() {
		return "Nome del Locatore: "+nomeLocatore+", Nome Conduttore: "+nomeConduttore+", Indirizzo: "+indirizzoMobile+", Numero di Metri Quadri: "+numeroMetriQuadri+", Tipologia Attività: "+tipologiaAttivita;
	}
	private int numeroMetriQuadri;
	private String tipologiaAttivita;
}	
