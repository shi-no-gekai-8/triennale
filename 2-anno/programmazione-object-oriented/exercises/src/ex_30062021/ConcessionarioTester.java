package ex_30062021;

import java.util.Scanner;

public class ConcessionarioTester {

	public static void main(String[] args) {
		Concessionario auto1 = new Concessionario("Jeep", "Jeep Wrangler", "AS123DF", 70.0, 50);
		Concessionario auto2 = new Concessionario("Chevrolet", "Matiz", "AS124DF", 40.0, 25);
		System.out.println("Auto create: "+auto1.toString()+", "+auto2.toString());
		Scanner input = new Scanner(System.in);
		System.out.println("Vuoi conoscere l'autonomia di queste due auto con quanti chilometri?");
		int chilometriLetti = input.nextInt();
		System.out.println("L'autonomia della "+auto1.getNome()+" è di "+auto1.calcolaAutonomia(chilometriLetti)+", mentre l'autonomia della "+auto2.getNome()+" è di "+auto2.calcolaAutonomia(chilometriLetti));
	}

}
