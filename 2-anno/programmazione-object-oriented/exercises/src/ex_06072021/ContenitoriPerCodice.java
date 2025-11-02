package ex_06072021;

import java.util.Comparator;

public class ContenitoriPerCodice implements Comparator<Contenitore> {

	@Override
	public int compare(Contenitore c1, Contenitore c2) {
		return Integer.compare(c1.getCodice(), c2.getCodice());
	}
	
}
