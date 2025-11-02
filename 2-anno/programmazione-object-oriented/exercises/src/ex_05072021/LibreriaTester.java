package ex_05072021;

public class LibreriaTester {

	public static void main(String[] args) {
		Libreria lib1 = new Libreria("Roraima", "Ambrose Locke", "Longanesi", 25);
		Libreria lib2 = new Libreria("Siberia Infernale", "Ambrose Locke", "Longanesi", 30);
		Libreria lib3 = new Libreria("Harry Potter e i Doni della Morte", "J.K. Rowling", "Salani", 35);
		Libreria lib4 = new Libreria("Il cecchino", "Clive Cussler", "Longanesi", 40);
		System.out.println(lib1.getTitoloPerAutore("Ambrose Locke"));
	}

}
