package ex_30062021;

public class CurlingTest {

	public static void main(String[] args) {
		Curling studente1 = new Curling("Alfonso", "Zappia", "Lead", 30, 2, 50.0);
		Curling studente2 = new Curling("Davide", "Amitrano", "Second", 25, 4, 100.50);
		System.out.println("## "+studente1.getNome()+" "+studente1.getCognome()+" ## Numero di partite: "+studente1.getPartiteGiocate()+" - Spesa sostenuta: "+studente1.getSpesaPartite());
		System.out.println("## "+studente2.getNome()+" "+studente2.getCognome()+" ## Numero di partite: "+studente2.getPartiteGiocate()+" - Spesa sostenuta: "+studente2.getSpesaPartite());
		System.out.println("L'anno è finito!");
		System.out.println("Nuovi dati degli studenti: ");
		studente1.setPartiteGiocate(0);
		studente1.setSpesaPartite(0);
		studente1.setNumeroInfortuni(0);
		studente2.setPartiteGiocate(0);
		studente2.setSpesaPartite(0);
		studente2.setNumeroInfortuni(0);
		System.out.println(studente1.toString());
		System.out.println(studente2.toString());
	}

}
