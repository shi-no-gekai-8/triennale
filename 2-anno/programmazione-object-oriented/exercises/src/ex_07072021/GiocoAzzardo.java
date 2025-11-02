package ex_07072021;

import java.util.Random;

public abstract class GiocoAzzardo {
	public GiocoAzzardo(double costo) {
		this.costo=costo;
		generator = new Random();
	}
	public Random getGenerator() {
		return generator;
	}
	public double getCosto() {
		return costo;
	}
	
	@Override
	public String toString() {
		return "GiocoAzzardo [generator=" + generator + ", costo=" + costo + "]";
	}
	protected abstract boolean gioca();
	protected abstract double dammiVincita();
	protected Random generator;
	protected double costo;
}
