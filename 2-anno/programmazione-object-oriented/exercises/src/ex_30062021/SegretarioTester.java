package ex_30062021;

public class SegretarioTester {

	public static void main(String[] args) {
		SegretarioCurioso studente1 = new SegretarioCurioso("Alfonso", "Zappia", "Informatica", 2020, 10, 25.5);
		SegretarioCurioso studente2 = new SegretarioCurioso("Davide", "Amitrano", "Informatica", 2019, 12, 24.5);
		studente1.setNumTotaleDiEsami(21);
		studente2.setNumTotaleDiEsami(21);
		System.out.println("Studente: "+studente1.getNome()+" "+studente1.getCognome()+" --> Esami Mancanti: "+studente1.getNumeroEsamiMancanti());
		System.out.println("Studente: "+studente2.getNome()+" "+studente2.getCognome()+" --> Esami Mancanti: "+studente2.getNumeroEsamiMancanti());
		if(studente1.getAnnoIscrizione()<studente2.getAnnoIscrizione()) {
			System.out.println(studente1.getNome()+" "+studente1.getCognome()+" è lo studente più anziano accademicamente");
		} else {
			System.out.println(studente2.getNome()+" "+studente2.getCognome()+" è lo studente più anziano accademicamente");
		}
	}

}
