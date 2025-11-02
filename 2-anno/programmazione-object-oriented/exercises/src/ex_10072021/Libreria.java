package ex_10072021;

import java.util.ArrayList;

public class Libreria {
	public Libreria() {
		listaLibri = new ArrayList<Libro>();
	}
	public void aggiungiLibro(Libro l) {
		listaLibri.add(l);
	}
	public String cercaPerTitolo(String titolo) throws TitoloNonPresenteException {
		for(Libro l : listaLibri) {
			if(!titolo.equalsIgnoreCase(l.getTitolo())) {
				throw new TitoloNonPresenteException();
			} else 
				return l.getTitolo();
		}
		return "";
	}
	private ArrayList<Libro> listaLibri;
}
