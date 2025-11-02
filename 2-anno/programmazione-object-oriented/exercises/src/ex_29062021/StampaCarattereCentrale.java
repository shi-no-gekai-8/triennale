package ex_29062021;

import java.util.Scanner;

public class StampaCarattereCentrale {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la parola: ");
		String stringaletta = input.nextLine();
		int l = stringaletta.length();
		if(l%2 == 0) {
			System.out.println("La parola "+stringaletta+" ha una lunghezza pari. Impossibile eseguire l'operazione.");
		} else {
			String nuova = stringaletta.substring(0, (l/2)+1);
			String  def = nuova.substring((nuova.length()-1));
			System.out.println(def);
		}
	}
}
