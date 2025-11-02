package ex_10072021;

import java.util.ArrayList;

public class ProgrammazioneDidattica {
	
	public ProgrammazioneDidattica(String nome, int numeroOreMinimo, int numeroOreMassimo) {
		this.nome = nome;
		listaCorsi = new ArrayList<Corso>();
		this.numeroOreMinimo = numeroOreMinimo;
		this.numeroOreMassimo = numeroOreMassimo;
	}
	public int getSize() {
		return listaCorsi.size();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Corso> getListaCorsi() {
		return listaCorsi;
	}
	public void setListaCorsi(ArrayList<Corso> listaCorsi) {
		this.listaCorsi = listaCorsi;
	}
	public int getNumeroOreMinimo() {
		return numeroOreMinimo;
	}
	public void setNumeroOreMinimo(int numeroOreMinimo) {
		this.numeroOreMinimo = numeroOreMinimo;
	}
	public int getNumeroOreMassimo() {
		return numeroOreMassimo;
	}
	public void setNumeroOreMassimo(int numeroOreMassimo) {
		this.numeroOreMassimo = numeroOreMassimo;
	}
	public void aggiungiCorso(Corso c) {
		int totaleOre = c.getOre();
		for(int i=0;i<listaCorsi.size();i++) {
			totaleOre += listaCorsi.get(i).getOre();
		}
		if(totaleOre > this.getNumeroOreMassimo()) {
			throw new OreSuperateException();
		}
		listaCorsi.add(c);
	}
	public void cancellaCorso(Corso c) {
		listaCorsi.remove(c);
	}

	public boolean verifica() {
		double sommaOre=0;
		for(int i=0;i<listaCorsi.size();i++) {
			sommaOre += listaCorsi.get(i).getOre();
			System.out.println("La somma totale delle ore è: "+sommaOre);
		}
		if(sommaOre <= numeroOreMassimo && sommaOre >= numeroOreMinimo) {
			return true;
		}
		return false;
	}
	public double calcolaCosto() {
		double costoTotale=0;
		for(int i=0;i<listaCorsi.size();i++) {
			costoTotale += listaCorsi.get(i).calcolaCosto();
		}
		return costoTotale;
	}
	public int calcolaCFU() {
		int CFUtotali=0;
		for(int i=0;i<listaCorsi.size();i++) {
			CFUtotali += listaCorsi.get(i).dammiNumeroCFU();
		}
		return CFUtotali;
	}
	private String nome;
	private ArrayList<Corso> listaCorsi;
	private int numeroOreMinimo;
	private int numeroOreMassimo;
}
