package ex_06072021;

public class Episode extends Serial {
	
	public Episode(String titoloSerie, String episodioIniziale, String titoloEpisodio, String trama, String prossimoEpisodio) {
		super(titoloSerie, episodioIniziale);
		this.titoloEpisodio = titoloEpisodio;
		this.trama = trama;
		this.prossimoEpisodio = prossimoEpisodio;
	}
	public String toString() {
		return "Titolo Serie: "+super.titolo+ ", Primo Episodio: "+super.episodioIniziale+", Titolo Secondo Episodio: "+titoloEpisodio+", Trama: "+trama+", Titolo Prossimo Episodio: "+prossimoEpisodio;
	}
	public boolean isEqualsTitoloEpisodio(String titolo) {
		if(titoloEpisodio.equalsIgnoreCase(titolo)||prossimoEpisodio.equalsIgnoreCase(titolo)) {
			return true;
		}
		return false;
	}
	private String titoloEpisodio;
	private String trama;
	private String prossimoEpisodio;
}
