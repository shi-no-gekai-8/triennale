package ex_07072021;

import java.util.ArrayList;

public class Cliente {
	
	public Cliente(String codiceFiscale, double saldoIniziale) {
		this.codiceFiscale = codiceFiscale;
		this.saldoIniziale = saldoIniziale;
		giocate = new ArrayList<GiocoAzzardo>();
	}
	public boolean acquistaBiglietto(GiocoAzzardo g) {
		if(g.getCosto()>saldoIniziale) {
			return false;
		}
		saldoIniziale -= g.getCosto();
		giocate.add(g);
		return true;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public double getSaldoIniziale() {
		return saldoIniziale;
	}
	public void setSaldoIniziale(double saldoIniziale) {
		this.saldoIniziale = saldoIniziale;
	}
	public String toString() {
		return "Cliente: "+codiceFiscale+", Saldo attuale: "+saldoIniziale+", Numero di biglietti acquistati: "+giocate.size();
	}
	private String codiceFiscale;
	private double saldoIniziale;
	private ArrayList<GiocoAzzardo> giocate;
}
