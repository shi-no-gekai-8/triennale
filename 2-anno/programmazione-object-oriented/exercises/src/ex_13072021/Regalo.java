package ex_13072021;

import java.util.GregorianCalendar;

public abstract class Regalo {
	public Regalo(double peso, GregorianCalendar dataConsegna, String regioneDestinatario) {
		this.peso = peso;
		this.dataConsegna = dataConsegna;
		this.regioneDestinatario = regioneDestinatario;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public GregorianCalendar getDataConsegna() {
		return dataConsegna;
	}
	public void setDataConsegna(GregorianCalendar dataConsegna) {
		this.dataConsegna = dataConsegna;
	}
	public String getRegioneDestinatario() {
		return regioneDestinatario;
	}
	public void setRegioneDestinatario(String regioneDestinatario) {
		this.regioneDestinatario = regioneDestinatario;
	}
	public abstract String toString();
	public abstract double calcolaCosto();
	protected double peso;
	protected GregorianCalendar dataConsegna;
	protected String regioneDestinatario;
}
