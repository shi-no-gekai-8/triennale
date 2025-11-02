package ex_08072021;

import java.util.ArrayList;
import java.util.Arrays;

public class ElencoElevatori {
	public ElencoElevatori() {
		listaElevatori = new ArrayList<Elevatore>();
	}
	public void aggiungiElevatore(Elevatore e) {
		listaElevatori.add(e);
	}
	public ArrayList<Elevatore> listaElevatori;
}
