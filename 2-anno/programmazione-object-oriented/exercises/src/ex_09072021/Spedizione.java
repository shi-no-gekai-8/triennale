package ex_09072021;

public abstract class Spedizione {
	public Spedizione(String origine, String destinazione) {
		this.origine = origine;
		this.destinazione = destinazione;
	}
	
	public String getOrigine() {
		return origine;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public abstract void spedisci(String partenza, String destinazione);
	public abstract double calcolaCosto();
	protected String origine;
	protected String destinazione;
}
