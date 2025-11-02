package ex_10072021;

import java.util.ArrayList;

public class CorsoMagistrale extends Corso {
	
	public CorsoMagistrale(String nome, String docente, int numeroOreFrontali) {
		super(nome, docente);
		indirizziStudio = new ArrayList<>();
	}
	@Override
	public int dammiNumeroCFU() {
		return numeroOreFrontali/8;
	}
	public ArrayList<String> getIndirizziStudio() {
		return indirizziStudio;
	}
	public void aggiungiCorsoObbligatorio(String corsoOb) {
		indirizziStudio.add(corsoOb);
	}
	@Override
	public double calcolaCosto() {
		return numeroOreFrontali*50;
	}
	@Override
	public int getOre() {
		return numeroOreFrontali;
	}
	@Override
	public String toString() {
		return "-- Corso Magistrale -- Nome: "+nome+", Docente: "+docente+", Numero Ore Frontali: "+numeroOreFrontali;
	}
	private ArrayList<String> indirizziStudio;
	private int numeroOreFrontali;
}
