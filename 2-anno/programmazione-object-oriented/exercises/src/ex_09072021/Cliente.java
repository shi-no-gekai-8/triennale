package ex_09072021;

import java.util.ArrayList;

public class Cliente {
	
	public Cliente(String codiceFiscale, double saldoDisponibile) {
		this.codiceFiscale = codiceFiscale;
		this.saldoDisponibile = saldoDisponibile;
		listaSpedizioni = new ArrayList<Spedizione>();
	}
	public void spedisci(Spedizione s) {
		if(saldoDisponibile<s.calcolaCosto()) {
			System.out.println("Saldo insufficiente");
		}
		s.spedisci(s.getOrigine(), s.getDestinazione());
		saldoDisponibile -= s.calcolaCosto();
	}
	
	public double getSaldoDisponibile() {
		return saldoDisponibile;
	}
	public String toString() {
		return "Codice Fiscale: "+codiceFiscale+", Saldo: "+saldoDisponibile;
	}
	private String codiceFiscale;
	private double saldoDisponibile;
	private ArrayList<Spedizione> listaSpedizioni;
}
