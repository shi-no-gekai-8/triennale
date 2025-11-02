package ex_30062021;
import java.awt.Rectangle;
public class AreaTester {

	public static void main(String[] args) {
		Rectangle rettangolo = new Rectangle(5, 10, 5, 10);
		int base = (int) rettangolo.getWidth();
		int altezza = (int) rettangolo.getHeight();
		System.out.println("Hai creato un rettangolo con base "+base+" e altezza: "+altezza);
		System.out.println("Ora calcoliamo l'area.");
		int area = base * altezza;
		System.out.println("A: "+area);
		System.out.println("Ora calcoliamo il perimetro.");
		int perimetro = (base+altezza)*2;
		System.out.println("P: "+perimetro);
	}

}
