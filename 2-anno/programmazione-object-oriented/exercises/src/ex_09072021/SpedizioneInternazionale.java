package ex_09072021;

import java.util.ArrayList;
import java.util.Random;

public class SpedizioneInternazionale extends Spedizione {

	public SpedizioneInternazionale(String origine, String destinazione) {
		super(origine, destinazione);
		listaCittaInternazionali = new ArrayList<String>();
		listaCittaInternazionali.add("Londra");
		listaCittaInternazionali.add("Parigi");
		listaCittaInternazionali.add("Roma");
		listaCittaInternazionali.add("Berlino");
		listaCittaInternazionali.add("Madrid");
		listaCittaInternazionali.add("Lisbona");
		listaCittaInternazionali.add("Amsterdam");
		listaCittaInternazionali.add("Mosca");
	}

	@Override
	public void spedisci(String partenza, String destinazione) {
		if(listaCittaInternazionali.contains(partenza) && listaCittaInternazionali.contains(destinazione)) {
			Random generator = new Random();
			int index = generator.nextInt(7-0)+0;
			String scalo = listaCittaInternazionali.get(index);
			String scalo2 = listaCittaInternazionali.get(index);
			System.out.println("La spedizione partirà da "+partenza+", passerà per "+scalo+" e "+scalo2+" e, alla fine, arriverà a "+destinazione+", per un costo totale di "+calcolaCosto()*3);
		} else {
			System.out.println("Per queste città non c'è copertura.");
		}
		
	}

	@Override
	public double calcolaCosto() {
		return 20;
	}
	private ArrayList<String>listaCittaInternazionali;
}
