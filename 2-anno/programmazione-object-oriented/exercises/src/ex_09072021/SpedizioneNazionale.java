package ex_09072021;

import java.util.ArrayList;
import java.util.Arrays;

public class SpedizioneNazionale extends Spedizione {
	
	public SpedizioneNazionale(String origine, String destinazione) {
		super(origine, destinazione);
		listaCittaNazionali = new ArrayList<String>();
		listaCittaNazionali.add("Aosta");
		listaCittaNazionali.add("Milano");
		listaCittaNazionali.add("Torino");
		listaCittaNazionali.add("Bologna");
		listaCittaNazionali.add("Firenze");
		listaCittaNazionali.add("Roma");
		listaCittaNazionali.add("Napoli");
		listaCittaNazionali.add("Salerno");
		listaCittaNazionali.add("Reggio Calabria");
		listaCittaNazionali.add("Palermo");
	}

	@Override
	public void spedisci(String partenza, String destinazione) {
		if(listaCittaNazionali.contains(partenza) && listaCittaNazionali.contains(destinazione)) {
			double costoTotale =+ calcolaCosto();
			System.out.println("La spedizione costerà: "+costoTotale);
		} else {
			System.out.println("Non c'è copertura in queste città.");
		}
		
	}

	@Override
	public double calcolaCosto() {
		int getOriginIndex = Arrays.asList(listaCittaNazionali).indexOf(origine);
		int getDestinationIndex = Arrays.asList(listaCittaNazionali).indexOf(destinazione);
		int sottrazioneCitta = getOriginIndex - getDestinationIndex;
		double costo = 3;
		switch(sottrazioneCitta) {
		case -1, 1 : return costo; 
		case -2, 2 : return costo*2;
		case -3, 3 : return costo*3;
		case -4, 4 : return costo*4;
		case -5, 5 : return costo*5;
		case -6, 6 : return costo*6;
		case -7, 7 : return costo*7;
		case -8, 8 : return costo*8;
		case -9, 9 : return costo*9;
		}
		return costo;
	}
	private ArrayList<String> listaCittaNazionali;
}
