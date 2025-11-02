package ex_08072021;

public class Ascensore extends Elevatore {
	
	public Ascensore(int codice, String marca, double prezzoBase, int pesoMax) {
		super(codice, marca, prezzoBase);
		this.pesoMax = pesoMax;
		occupato = false;
		numeroUtilizzi = 0;
	}
	public boolean prenota() {
		if(occupato) {
			return false;
		}
		return occupato = true;
	}
	public boolean utilizza(double peso) {
		if(peso<pesoMax) {
			prenota();
			numeroUtilizzi++;
		}
		return false;
	}
	public int getNumeroUtilizzi() {
		return numeroUtilizzi;
	}
	public int getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}
	public double getCosto() {
		return (super.prezzoBase*pesoMax)/100;
	}
	private boolean occupato;
	private int pesoMax;
	private int numeroUtilizzi;
}
