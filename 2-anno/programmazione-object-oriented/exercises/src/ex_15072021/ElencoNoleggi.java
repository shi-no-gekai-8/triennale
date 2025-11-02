package ex_15072021;

import java.util.ArrayList;
import java.util.Collections;

public class ElencoNoleggi {
	public ElencoNoleggi() {
		this.listaNoleggi = new ArrayList<Noleggio>();
	}
	public int getSize() {
		return listaNoleggi.size();
	}
	public ArrayList<Noleggio> getListaNoleggi() {
		return listaNoleggi;
	}

	public void setListaNoleggi(ArrayList<Noleggio> listaNoleggi) {
		this.listaNoleggi = listaNoleggi;
	}
	@SuppressWarnings("unlikely-arg-type")
	public void aggiungiNoleggio(Noleggio n) {
		try {
			int codice = n.getFilm().getCodice();
			if(listaNoleggi.contains(codice)) {
				throw new BadCodeException();
			}
			listaNoleggi.add(n);
		} catch(BadCodeException e) {
			System.out.println(e.toString());
		}
	}
	public void ordinaPerCodice() {
		Collections.sort(listaNoleggi, new OrdinaPerCodice());
	}
	public double calcolaPenaliRitardo() {
		double totalePenali=0;
		for(int i=0;i<listaNoleggi.size();i++) {
			totalePenali += listaNoleggi.get(i).calcolaPenale();
		}
		return totalePenali;
	}
	public void cerca(String t){
		ArrayList<Noleggio> matchingList = new ArrayList<Noleggio>();
		for(int i=0;i<listaNoleggi.size();i++) {
			if(listaNoleggi.get(i).getFilm().getTitolo().contains(t)) {
				matchingList.add(listaNoleggi.get(i));
			}
		}
		
		for(Noleggio n : matchingList) {
			System.out.println(n.toString());
		}
	}
	
	public void printAllElements() {
		for(Noleggio n : listaNoleggi) {
			System.out.println(n.toString());
		}
	}

	private ArrayList<Noleggio> listaNoleggi;
}
