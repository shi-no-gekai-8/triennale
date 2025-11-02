package ex_05072021;

public class Libreria {
	public Libreria(String titolo, String autore, String editore, int numeroCopieDisponibili) {
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.numeroCopieDisponibili = numeroCopieDisponibili;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public String getEditore() {
		return editore;
	}

	public int getNumeroCopieDisponibili() {
		return numeroCopieDisponibili;
	}

	public String getTitoloPerAutore(String autoreRichiesto) {
		if(autore.equalsIgnoreCase(autoreRichiesto)) {
			return titolo;
		}
		return "Nessun libro di questo autore";
	}
	public String getTitoloPerSottostringa(String subStr) {
		if(titolo.contains(subStr)) {
			return titolo;
		}
		return "Nessun libro per questa stringa";
	}
	private String titolo;
	private String autore;
	private String editore;
	private int numeroCopieDisponibili;
}
