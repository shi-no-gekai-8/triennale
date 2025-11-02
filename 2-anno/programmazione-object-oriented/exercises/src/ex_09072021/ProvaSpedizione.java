package ex_09072021;

import java.util.ArrayList;
import java.util.Collections;

public class ProvaSpedizione {

	public static void main(String[] args) {
		ArrayList<String> listaCittaInternazionali = new ArrayList<String>();
		listaCittaInternazionali.add("Londra");
		listaCittaInternazionali.add("Parigi");
		listaCittaInternazionali.add("Roma");
		listaCittaInternazionali.add("Berlino");
		listaCittaInternazionali.add("Madrid");
		listaCittaInternazionali.add("Lisbona");
		listaCittaInternazionali.add("Amsterdam");
		listaCittaInternazionali.add("Mosca");
		Collections.shuffle(listaCittaInternazionali);
		System.out.println("Citta: ");
		for(String s : listaCittaInternazionali) {
			System.out.println(s);
		}
	}

}
