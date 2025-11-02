package ex_30062021;

public class RimpiazzaStringhe {
	public static void main(String[] args) {
		String mississipi = "Mississipi";
		String nuova = mississipi.replace("i", "ii");
		System.out.println("Stringa ottenuta: "+nuova+" di lunghezza "+nuova.length());
		String nuovanuova = nuova.replace("ss", "s");
		System.out.println("Stringa ottenuta: "+nuovanuova+" di lunghezza "+nuovanuova.length());
	}
}
