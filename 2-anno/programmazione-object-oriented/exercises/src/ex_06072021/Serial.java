package ex_06072021;

public abstract class Serial {
	
	public Serial(String titolo, String episodioIniziale) {
		this.titolo = titolo;
		this.episodioIniziale = episodioIniziale;
	}
	
	public String toString() {
		return "Titolo: "+titolo+", Titolo Episodio Iniziale: "+episodioIniziale;
	}
	public boolean isEqualsTitle(String titoloSerie) {
		if(titoloSerie.equalsIgnoreCase(titolo)) {
			return true;
		}
		return false;
	}
	public boolean isEqualsEpisode(String titoloEpisodioIniziale) {
		if(titoloEpisodioIniziale.equalsIgnoreCase(episodioIniziale)) {
			return true;
		}
		return false;
	}
	protected String titolo;
	protected String episodioIniziale;
}
