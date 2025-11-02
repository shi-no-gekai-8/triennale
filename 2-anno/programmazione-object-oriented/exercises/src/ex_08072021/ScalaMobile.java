package ex_08072021;

public class ScalaMobile extends Elevatore {
	
	public ScalaMobile(int codice, String marca, double prezzoBase, double lunghezza) {
		super(codice, marca, prezzoBase);
		inFunzione = true;
		this.lunghezza = lunghezza;
	}
	public int dammiTempo() {
		int start = (int) System.currentTimeMillis();
		return start;
	}
	public double getCosto() {
		return (super.prezzoBase*lunghezza)/10;
	}
	private boolean inFunzione;
	private double lunghezza;
}
