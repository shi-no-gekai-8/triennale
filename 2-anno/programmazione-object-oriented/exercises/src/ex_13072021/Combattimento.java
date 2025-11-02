package ex_13072021;

import java.util.ArrayList;

public class Combattimento {
	public Combattimento() {
		listaMostri = new ArrayList<Mostro>();
	}
	public ArrayList<Mostro> getListaMostri() {
		return listaMostri;
	}
	public int getSize() {
		return listaMostri.size();
	}
	public void setListaMostri(ArrayList<Mostro> listaMostri) {
		this.listaMostri = listaMostri;
	}
	public void aggiungiMostro(Mostro m) {
		listaMostri.add(m);
	}
	public void combatti(int i, int j) {
		listaMostri.get(i).attacca(listaMostri.get(j));
		listaMostri.get(j).attacca(listaMostri.get(i));
	}
	public void rimuovi() {
		for(Mostro m : listaMostri) {
			if(m.getVitalita() <= 0) {
				listaMostri.remove(m);
			}
		}
	}
	@Override
	public String toString() {
		return "Combattimento [listaMostri=" + listaMostri + "]";
	}

	private ArrayList<Mostro> listaMostri;
}
