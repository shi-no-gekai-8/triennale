package ex_10072021;

import java.util.Comparator;

public class TecniciPerIncontri implements Comparator<Tecnico> {

	@Override
	public int compare(Tecnico t1, Tecnico t2) {
		return Integer.compare(t1.getNumeroIncontri(), t2.getNumeroIncontri());
	}
	
}
