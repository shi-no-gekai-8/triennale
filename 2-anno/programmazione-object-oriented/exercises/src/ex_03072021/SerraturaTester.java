package ex_03072021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerraturaTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> lettereCombinazione = new ArrayList<String>();
		for(int i=0;i<3;i++) {
			System.out.println("Inserisci una lettera maiuscola: ");
			String letteraLetta = input.nextLine();
			lettereCombinazione.add(letteraLetta);
		}
		String combinazione = lettereCombinazione.get(0)+lettereCombinazione.get(1)+lettereCombinazione.get(2);
		Serratura serratura = new Serratura();
		serratura.setLettera(combinazione);
		serratura.unlock(combinazione);
		System.out.println(serratura.isOpen());
		serratura.lock();
		serratura.newComb("ABC");
		System.out.println(serratura.getLettera());
	}

}
