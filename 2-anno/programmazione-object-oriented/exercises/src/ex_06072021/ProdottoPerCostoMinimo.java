package ex_06072021;

import java.util.Comparator;

public class ProdottoPerCostoMinimo implements Comparator<Prodotto> {

	@Override
	public int compare(Prodotto p1, Prodotto p2) {
		return Double.compare(p1.getPrezzo(), p2.getPrezzo());
	}

	
	
}
