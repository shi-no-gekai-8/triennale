package ex_13072021;

import java.util.GregorianCalendar;

public class RegaloPerAdulti extends Regalo {
	public RegaloPerAdulti(double peso, GregorianCalendar dataConsegna, String regioneDestinatario, String mittente) {
		super(peso, dataConsegna, regioneDestinatario);
		this.mittente = mittente;
	}
	public String getMittente() {
		return mittente;
	}
	public void setMittente(String mittente) {
		this.mittente = mittente;
	}
	public String toString() {
		return "Mittente: "+mittente;
	}
	public double calcolaCosto() {
		if(super.regioneDestinatario.equalsIgnoreCase("Nord")) {
			return 10;
		} else if(super.regioneDestinatario.equalsIgnoreCase("Centro")) {
			return 15;
		} else if(super.regioneDestinatario.equalsIgnoreCase("Sud")) {
			return 20;
		}
		return 0;
	}
	private String mittente;
}
