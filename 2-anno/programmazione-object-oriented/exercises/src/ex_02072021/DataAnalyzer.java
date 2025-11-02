package ex_02072021;

import java.util.Scanner;

public class DataAnalyzer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DataSert data = new DataSert();
		boolean done = false;
		while(!done) {
			System.out.println("Inserisci un valore o Q per uscire: ");
			String in = input.next();
			if(in.equalsIgnoreCase("Q")) {
				done = true;
			} else {
				double x = Double.parseDouble(in);
				data.addiziona(x);
			}
		}
		System.out.println("Media = "+data.getMedia());
		System.out.println("Massimo = "+data.getMassimo());
	}

}
