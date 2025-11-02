package ex_01072021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeggiParola {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		List<String> vocabolario = new ArrayList<String>();
		System.out.println("Quante parole vorresti inserire?");
		int numeroLetto = input2.nextInt();
		for(int i=0;i<numeroLetto;i++) {
			System.out.println("Inserisci una parola: ");
			String letto = input1.nextLine();
			vocabolario.add(letto);
			vocabolario.sort(String::compareTo);
		}
		System.out.println(vocabolario.get(0));
		System.out.println(vocabolario.get(vocabolario.size()-1));
	}

}
