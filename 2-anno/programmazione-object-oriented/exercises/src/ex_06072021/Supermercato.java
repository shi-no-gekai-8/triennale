package ex_06072021;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercato {
	public Supermercato() {
		this.listProd = new ArrayList<Prodotto>();
	}
	public void aggiungiProdotto(Prodotto p) {
		listProd.add(p);
	}
	public String daiTipoDiProdotto(int i) {
		return listProd.get(i).getClass().getName();
	}
	public void sortPerPrezzo() {
		Collections.sort(listProd, new ProdottoPerCostoMinimo());
	}
	public Prodotto getMinimo() {
		return listProd.get(0);
	}
	public Prodotto getMassimo() {
		return listProd.get(listProd.size()-1);
	}
	public ArrayList<Prodotto> cerca(String marca){
		ArrayList<Prodotto> marcaSelezionata = new ArrayList<Prodotto>();
		for(Prodotto p : listProd) {
			if(p.getMarca().equalsIgnoreCase(marca)) {
				marcaSelezionata.add(p);
			}
		}
		return marcaSelezionata;
	}
	
	@Override
	public String toString() {
		return listProd.toString();
	}

	private ArrayList<Prodotto> listProd;
}
