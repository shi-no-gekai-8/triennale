package ex_08072021;

import java.util.ArrayList;

public class provaArrayStringhe {
	public static void main(String[] args) {
		ArrayList<Città> listaCitta = new ArrayList<Città>();
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
		String cittaPartenza = "Palermo";
		String cittaArrivo = "Napoli";
		for(Città c : listaCitta) {
			if(cittaPartenza.equalsIgnoreCase(c.name()) && cittaArrivo.equalsIgnoreCase(c.name())) {
				System.out.println("Ok");
			}
		}
		}
}
