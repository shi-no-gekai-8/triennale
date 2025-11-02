package ex_15072021;


public class FilmTester {
	public static void main(String[] args) {
		Azione a1 = new Azione(1, "Mission Impossible: Fallout", 2);
		Azione a2 = new Azione(2, "Rambo", 3);
		Azione a3 = new Azione(3, "Rambo 2", 4);
		Commedia c1 = new Commedia(4, "Una Notte da Leoni", 5);
		Commedia c2 = new Commedia(5, "Hot Fuzz", 6);
		Commedia c3 = new Commedia(6, "Cattivi Vicini", 7);
		Noleggio n1 = new Noleggio(a1, 1);
		Noleggio n2 = new Noleggio(a2, 2);
		Noleggio n3 = new Noleggio(a3, 3);
		Noleggio n4 = new Noleggio(c1, 4);
		Noleggio n5 = new Noleggio(c2, 5);
		Noleggio n6 = new Noleggio(c3, 6);
		ElencoNoleggi listaNoleggi = new ElencoNoleggi();
		listaNoleggi.aggiungiNoleggio(n1);
		listaNoleggi.aggiungiNoleggio(n2);
		listaNoleggi.aggiungiNoleggio(n3);
		listaNoleggi.aggiungiNoleggio(n4);
		listaNoleggi.aggiungiNoleggio(n5);
		listaNoleggi.aggiungiNoleggio(n6);
		listaNoleggi.ordinaPerCodice();
		listaNoleggi.printAllElements();
		System.out.println(c3.calcolaPenaleRitardo(c3.getGiorniRitardo()));
		System.out.println("Totale Penali: "+listaNoleggi.calcolaPenaliRitardo());
		listaNoleggi.cerca("2");
		// GraficaMovies grafica = new GraficaMovies(listaNoleggi);
	}
}
