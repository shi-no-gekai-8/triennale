package ex_01072021;

import java.util.Scanner;

public class InputChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Che vuoi fare?");
		String letto = input.nextLine();
		switch(letto) {
		case "S": System.out.println("OK"); break;
		case "SI": System.out.println("OK"); break;
		case "OK": System.out.println("OK"); break;
		case "certo": System.out.println("OK"); break;
		case "perche' no?": System.out.println("OK"); break;
		case "N": System.out.println("Fine"); break;
		case "No": System.out.println("Fine"); break;
		default: System.out.println("Dato non corretto"); break;
		}
	}	
}
