package ex_06072021;

import java.util.Comparator;

public class ContenitoriPerNomeComparator implements Comparator<Contenitore> {

	@Override
	public int compare(Contenitore c1, Contenitore c2) {
		return c1.getNome().compareTo(c2.getNome());
	}
	
}
