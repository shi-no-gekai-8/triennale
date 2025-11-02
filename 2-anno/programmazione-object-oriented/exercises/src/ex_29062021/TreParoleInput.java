package ex_29062021;

import java.util.Scanner;

public class TreParoleInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la prima parola: ");
		String primaParola = input.nextLine();
		System.out.println("Inserisci la seconda parola: ");
		String secondaParola = input.nextLine();
		System.out.println("Inserisci la terza parola: ");
		String terzaParola = input.nextLine();
		String primaLettera = primaParola.substring(0, 0+1);
		String secondaLettera = secondaParola.substring(0, 0+1);
		String terzaLettera = terzaParola.substring(0, 0+1);
		System.out.println(primaLettera+secondaLettera+terzaLettera);
	}

}
