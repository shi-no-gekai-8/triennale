package ex_06072021;

import java.util.GregorianCalendar;

public class Elettronico extends Prodotto {
	
	public Elettronico(int codice, String descrizione, String marca, double prezzo, int quantita, GregorianCalendar garanziaBase, double prezzoGaranziaAnnuale) {
		super(codice, descrizione, marca, prezzo, quantita);
		this.garanziaBase = garanziaBase;
		this.prezzoGaranziaAnnuale = prezzoGaranziaAnnuale;
	}
	public double calcolaGaranzia(int a) {
		return a*prezzoGaranziaAnnuale;
	}
	public int acquista(int p) {
		return quantita-p;
	}
	public String toString() {
		return "Codice: "+codice+", Descrizione: "+descrizione+", Marca: "+marca+", Prezzo: "+prezzo+", Quantità: "+quantita+", Garanzia Base: "+garanziaBase+", Prezzo Garanzia Annuale: "+prezzoGaranziaAnnuale+"\n";
	}
	private GregorianCalendar garanziaBase;
	private double prezzoGaranziaAnnuale;
}
