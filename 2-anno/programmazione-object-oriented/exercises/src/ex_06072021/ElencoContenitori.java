package ex_06072021;

import java.util.ArrayList;
import java.util.Collections;

public class ElencoContenitori{
	public ElencoContenitori() {
		lotto = new ArrayList<Contenitore>();
	}
	public int getSize() {
		return lotto.size();
	}
	public void addContenitore(Contenitore c) {
		lotto.add(c);
	}
	public void removeContenitore(Contenitore c) {
		lotto.remove(c);
	}
	public void sortPerNome() {
		Collections.sort(lotto, new ContenitoriPerNomeComparator());
	}
	public void sortPerCodice() {
		Collections.sort(lotto, new ContenitoriPerCodice());
	}
	
	@Override
	public String toString() {
		String r = " ";
		for(Contenitore c : lotto) {
			r += c+"\n";
		}
		return r;
	}
	public Contenitore getFirstElement() {
		return lotto.get(0);
	}
	public Contenitore getLastElement() {
		return lotto.get(getSize()-1);
	}

	public ArrayList<Contenitore> lotto;	
	}
