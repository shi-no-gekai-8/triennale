package ex_13072021;

import java.util.GregorianCalendar;

public class RegaloPerBambini extends Regalo {
	public RegaloPerBambini(double peso, GregorianCalendar dataConsegna, String regioneDestinatario, String nome, int eta, String messaggio) {
		super(peso, dataConsegna, regioneDestinatario);
		this.nome = nome;
		this.eta = eta;
		this.messaggio = messaggio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	public String toString() {
		return "HoHoHo "+messaggio;
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
	private String nome;
	private int eta;
	private String messaggio;
}
