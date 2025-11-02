package ex_08072021;

import java.util.ArrayList;
import java.util.Arrays;

public class SpedizioneNazionale {
	
	public SpedizioneNazionale(String origine, String destinazione) {
		this.origine = origine;
		this.destinazione = destinazione;
		listaCitta = new ArrayList<Città>();
		listaCitta.add(Città.Aosta);
		listaCitta.add(Città.Milano);
		listaCitta.add(Città.Torino);
		listaCitta.add(Città.Bologna);
		listaCitta.add(Città.Firenze);
		listaCitta.add(Città.Roma);
		listaCitta.add(Città.Napoli);
		listaCitta.add(Città.Salerno);
		listaCitta.add(Città.Reggio_Calabria);
		listaCitta.add(Città.Palermo);
	}
	public void spedisci(String partenza, String arrivo) {
		if(listaCitta.contains(partenza) && listaCitta.contains(arrivo)) {
			calcolaCosto();
		} else {
			System.out.println("Le città non sono valide. ");
		}
	}
	public double calcolaCosto() {
		int getOriginIndex = Arrays.asList(listaCitta).indexOf(origine);
		int getDestinationIndex = Arrays.asList(listaCitta).indexOf(destinazione);
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
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public String origine;
	public String destinazione;
	public ArrayList<Città> listaCitta;
}
