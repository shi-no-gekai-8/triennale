package ex_29062021;

import java.util.Scanner;

public class ScambiaCaratteri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		String stringaletta = input.nextLine();
		int l = stringaletta.length();
		if(l<2) {
			System.out.println("Impossibile effettuare l'operazione con "+stringaletta+", perché ha meno di due caratteri");
		} else {
			String prima = stringaletta.substring(0, 1);
			String ultima = stringaletta.substring((l-1), l);
			String senzaEstremi = stringaletta.substring(1, (l-1));
			System.out.println(ultima+senzaEstremi+prima);
		}
	}
}
