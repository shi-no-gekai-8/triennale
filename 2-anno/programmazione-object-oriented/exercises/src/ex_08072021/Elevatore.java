package ex_08072021;

public abstract class Elevatore {
	
	public Elevatore(int codice, String marca, double prezzoBase) {
		this.codice = codice;
		this.marca = marca;
		this.prezzoBase = prezzoBase;
		acceso = false;
	}
	public boolean accendi() throws RunTimeException {
		if(!acceso) {
			throw new RunTimeException();
		}
		return acceso = true;
	}
	public boolean spegni() throws RunTimeException {
		if(acceso) {
			throw new RunTimeException();
		}
		return acceso = false;
	}
	
	public double getPrezzoBase() {
		return prezzoBase;
	}
	
	public int getCodice() {
		return codice;
	}
	public abstract double getCosto();
	protected int codice;
	protected String marca;
	protected double prezzoBase;
	protected boolean acceso;
}
