package ex_15072021;

public class Commedia extends Film {
	public Commedia(int codice, String titolo, int giorniRitardo) {
		super(codice, titolo, giorniRitardo);
	}
	public String toString() {
		return "-- FILM COMMEDIA -- Titolo: "+titolo+", Giorni di Ritardo: "+giorniRitardo;
	}
	public double calcolaPenaleRitardo(int numeroGiorniRitardo) {
		return numeroGiorniRitardo*2.5;
	}
}
