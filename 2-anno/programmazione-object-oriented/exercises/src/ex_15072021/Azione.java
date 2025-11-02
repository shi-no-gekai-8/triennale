package ex_15072021;

public class Azione extends Film {
	public Azione(int codice, String titolo, int giorniRitardo) {
		super(codice, titolo, giorniRitardo);
	}
	public String toString() {
		return "-- FILM DI AZIONE -- Titolo: "+titolo+", Giorni di Ritardo: "+giorniRitardo;
	}
	public double calcolaPenaleRitardo(int numeroGiorniRitardo) {
		return numeroGiorniRitardo*3;
	}
}
