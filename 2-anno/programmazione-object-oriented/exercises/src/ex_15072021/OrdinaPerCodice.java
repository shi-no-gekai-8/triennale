package ex_15072021;

import java.util.Comparator;

public class OrdinaPerCodice implements Comparator<Noleggio> {
	@Override
	public int compare(Noleggio n1, Noleggio n2) {
		return Integer.compare(n1.getFilm().getCodice(), n2.getFilm().getCodice());
	}
	
}
