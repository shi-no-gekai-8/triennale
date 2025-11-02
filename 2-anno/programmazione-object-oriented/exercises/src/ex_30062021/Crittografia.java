package ex_30062021;
import java.util.Scanner;
public class Crittografia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la parola/frase che vuoi codificare e premi invio: ");
		String inChiaro = in.nextLine();
		String codificata = inChiaro.replace("i", "!");
		String nuovaCodifica = codificata.replace("s", "$");
		System.out.println("Parola codificata: "+nuovaCodifica);

	}

}
