package ex_06072021;

public class TestPersonale {
	public static void main(String[] args) {
	Personale p1 = new Impiegato("Alfonso Zappia", 50, "Addetto carrelista");
	Personale p2 = new Manager("Davide Amitrano", 100, "Supervisore", "Risorse Umane");
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	}
}
