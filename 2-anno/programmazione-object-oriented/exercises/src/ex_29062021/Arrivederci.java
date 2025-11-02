package ex_29062021;

public class Arrivederci {
	public static void main(String[] args) {
		String arrivederci = "Arrivederci";
		String separatorePrima = arrivederci.substring(0, 3);
		String separatoreDopo = arrivederci.substring(4, arrivederci.length());
		System.out.println("Numero di occorrenze prima: "+separatorePrima.length()+" - Numero di occorrenze dopo: "+separatoreDopo.length());
		System.out.println(separatoreDopo+separatorePrima);
	}
}
