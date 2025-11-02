package ex_06072021;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SupermercatoTester {
	public static void main(String[] args) {
		Supermercato s = new Supermercato();
		GregorianCalendar data = new GregorianCalendar(2022, Calendar.APRIL, 2);
		s.aggiungiProdotto(new Alimentare(100, "Wafer Croccante con Crema alla Nocciola", "Ferrero", 1.2, 30, data, 1));
		s.aggiungiProdotto(new Alimentare(101, "Barretta a cioccolato con cereali", "Ferrero", 1.3, 31, data, 2));
		s.aggiungiProdotto(new Elettronico(102, "Samsung Note 10", "Samsung", 500, 30, data, 50));
		s.aggiungiProdotto(new Elettronico(103, "Iphone 8", "Apple", 800, 30, data, 50));
		System.out.println(s.toString());
	}
}
