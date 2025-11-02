package ex_06072021;

import java.util.GregorianCalendar;

public class Alimentare extends Prodotto {
	
	public Alimentare(int codice, String descrizione, String marca, double prezzo, int quantita, GregorianCalendar dataScadenza, int peso) {
		super(codice, descrizione, marca, prezzo, quantita);
		this.dataScadenza = dataScadenza;
		this.peso = peso;
		this.scaduto = false;
	}
	public boolean èScaduto() {
		long t1 = GregorianCalendar.getInstance().getTimeInMillis();
		long t2 = dataScadenza.getTimeInMillis();
		if((t1 - t2) > 0) {
			scaduto = true;
		}
		return scaduto;
	}
	public boolean acquista(int p) {
		if(peso >= p && getQuantita() >= p) {
			peso -= p;
			quantita--;
			return true;
		}
		return false;
	}
	public String toString() {
		return "Codice: "+codice+", Descrizione: "+descrizione+", Marca: "+marca+", Prezzo: "+prezzo+", Quantità: "+quantita+", Data Scadenza: "+dataScadenza+", Peso: "+peso+"\n";
	}
	private GregorianCalendar dataScadenza;
	private boolean scaduto;
	private int peso;
}
