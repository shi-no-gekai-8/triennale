package ex_13072021;

import java.util.ArrayList;

public class PagamentoPasti {
	public PagamentoPasti(ArrayList<Tesserino> listaTesserini) {
		listaTesserini = new ArrayList<Tesserino>();
	}
	public ArrayList<Tesserino> getListaTesserini() {
		return listaTesserini;
	}
	public void setListaTesserini(ArrayList<Tesserino> listaTesserini) {
		this.listaTesserini = listaTesserini;
	}

	private ArrayList<Tesserino> listaTesserini;
}
