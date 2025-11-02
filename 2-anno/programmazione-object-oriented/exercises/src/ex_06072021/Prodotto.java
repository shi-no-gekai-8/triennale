package ex_06072021;

import java.util.GregorianCalendar;

public abstract class Prodotto {
	public Prodotto(int codice, String descrizione, String marca, double prezzo, int quantita) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.marca = marca;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.inOfferta = false;
		scadenza = new GregorianCalendar();
	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public boolean isInOfferta() {
		return inOfferta;
	}
	public void setInOfferta(boolean inOfferta) {
		this.inOfferta = inOfferta;
	}
	public boolean mettiInOfferta(double p, GregorianCalendar g) {
		if(inOfferta) {
			return false;
		}
		inOfferta = true;
		vecchioPrezzo = prezzo;
		prezzo = (prezzo-(prezzo/100*p));
		scadenza = g;
		return true;
	}
	public boolean controllaOfferta() {
		if(inOfferta) {
			long t1 = GregorianCalendar.getInstance().getTimeInMillis();
			long t2 = scadenza.getTimeInMillis();
			if((t1-t2)>0) {
				inOfferta = false;
				prezzo = vecchioPrezzo;
				return true;
			}
		}
		return false;
	}
	protected int codice;
	protected String descrizione;
	protected String marca;
	protected double prezzo;
	protected int quantita;
	protected boolean inOfferta;
	private double vecchioPrezzo;
	private GregorianCalendar scadenza;
}
