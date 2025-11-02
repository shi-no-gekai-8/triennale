package ex_10072021;

public class Libro {
	public Libro(String titolo, String autore, int numeroPagine, String descrizione) {
		this.titolo = titolo;
		this.autore = autore;
		this.numeroPagine = numeroPagine;
		this.descrizione = descrizione;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String toString() {
		return "Titolo: "+titolo+", Autore: "+autore+", Numero Pagine: "+numeroPagine+", Descrizione: "+descrizione;
	}
	private String titolo;
	private String autore;
	private int numeroPagine;
	private String descrizione;
}
