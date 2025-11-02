package ex_12072021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrazioneTester {

	public static void main(String[] args) throws BadDateException, ParseException {
		Registrazioni listaRegistrazioni = new Registrazioni();
		Studente s1 = new Studente(0, "Alfonso", "Zappia", null, "UNISA", Tipologia.Triennale);
		Studente s2 = new Studente(0, "Davide", "Amitrano", null, "UNISA", Tipologia.Triennale);
		System.out.println(s1.getDataRegistrazione());

	}

}
