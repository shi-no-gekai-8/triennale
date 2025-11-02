package ex_05072021;

public class PersonaTester {

	public static void main(String[] args) {
		Persona studente = new Studente("Alfonso", 2000, "Informatica");
		Persona insegnante = new Insegnante("Maurizio", 1958, 3000.0);
		System.out.println(studente.toString());
		System.out.println(insegnante.toString());
	}

}
