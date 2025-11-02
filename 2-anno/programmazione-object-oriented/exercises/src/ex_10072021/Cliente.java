package ex_10072021;

import java.util.ArrayList;

public class Cliente {
	
	public Cliente(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		numeroRelazioniTecnicheOttenute = 0;
		listaDocumentiConsegnare = new ArrayList<String>();
		listaSpeseSostenute = new ArrayList<String>();
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public int getNumeroRelazioniTecnicheOttenute() {
		return numeroRelazioniTecnicheOttenute;
	}

	public void setNumeroRelazioniTecnicheOttenute(int numeroRelazioniTecnicheOttenute) {
		this.numeroRelazioniTecnicheOttenute = numeroRelazioniTecnicheOttenute;
	}
	public ArrayList<String> getListaDocumentiConsegnare() {
		return listaDocumentiConsegnare;
	}
	public void setListaDocumentiConsegnare(ArrayList<String> listaDocumentiConsegnare) {
		this.listaDocumentiConsegnare = listaDocumentiConsegnare;
	}

	public ArrayList<String> getListaSpeseSostenute() {
		return listaSpeseSostenute;
	}

	public void setListaSpeseSostenute(ArrayList<String> listaSpeseSostenute) {
		this.listaSpeseSostenute = listaSpeseSostenute;
	}
	public String toString() {
		return "Codice Fiscale: "+codiceFiscale+", Numero Relazioni Ottenute: "+numeroRelazioniTecnicheOttenute+", Lista Documenti da Consegnare: "+listaDocumentiConsegnare+", Lista spese sostenute: "+listaSpeseSostenute;
	}
	private String codiceFiscale;
	private int numeroRelazioniTecnicheOttenute;
	private ArrayList<String> listaDocumentiConsegnare;
	private ArrayList<String> listaSpeseSostenute;
}
