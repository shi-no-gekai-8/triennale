package ex_07072021;

public class CartaAlta extends GiocoAzzardo {
	public CartaAlta(double costo, int a, int b, int c, int d) {
		super(costo);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	@Override
	protected boolean gioca() {
		System.out.println("Banco: "+a+", "+b+". Giocatore: "+c+", "+d);
		if(c>a && d>b) {
			return true;
		}
		return false;
	}
	@Override
	protected double dammiVincita() {
		if(gioca()) {
			System.out.println("Mi dispiace, hai perso.");
		}
		return getCosto()*5;
	}
	private int a;
	private int b;
	private int c;
	private int d;
}
