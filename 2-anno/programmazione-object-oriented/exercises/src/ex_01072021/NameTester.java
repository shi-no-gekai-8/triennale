package ex_01072021;

import ex_01072021.Name.Titolo;

public class NameTester {

	public static void main(String[] args) {
		Name persona = new Name("Alfonso", "Zappia", Titolo.Signor);
		System.out.println(persona.toString());
		System.out.println(persona.getIniziali());
		System.out.println(persona.getNomeCognome());
		System.out.println(persona.getCognomeNome());
		persona.setTitolo(Titolo.Signora);
		System.out.print(persona.toString());
	}

}
