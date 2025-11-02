package ex_01072021;

import java.util.Scanner;

public class AnnoTester {

	public static void main(String[] args) {
		Scanner inputAnno = new Scanner(System.in);
		System.out.println("Inserisci l'anno: ");
		int annoletto = inputAnno.nextInt();
		Scanner inputMese = new Scanner(System.in);
		System.out.println("Inserisci numero del mese: ");
		int numeroLetto = inputMese.nextInt();
		switch(numeroLetto) {
		case 1: Month gennaio = new Month(31, "Gennaio"); System.out.println("Anno: "+annoletto+", Mese: "+gennaio.getNome()+", Giorni: "+gennaio.getGiorni()); break;
		case 2: Month febbraio = new Month(28, "Febbraio"); System.out.println("Anno: "+annoletto+", Mese: "+febbraio.getNome()+", Giorni: "+febbraio.getGiorni()); break;
		case 3: Month marzo = new Month(31, "Marzo"); System.out.println("Anno: "+annoletto+", Mese: "+marzo.getNome()+", Giorni: "+marzo.getGiorni()); break;
		}
	}

}
