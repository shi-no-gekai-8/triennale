package ex_14072021;

import java.util.GregorianCalendar;

public abstract class Prenotazione {
	public Prenotazione(String nome, GregorianCalendar dataPrenotazione, GregorianCalendar dataPrenotata) {
		this.nome = nome;
		this.dataPrenotazione = null;
		this.dataPrenotata = null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public GregorianCalendar getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(GregorianCalendar dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public GregorianCalendar getDataPrenotata() {
		return dataPrenotata;
	}
	public void setDataPrenotata(GregorianCalendar dataPrenotata) {
		this.dataPrenotata = dataPrenotata;
	}
	public abstract String dammiNome();
	public abstract double calcolaCosto();
	protected String nome;
	protected GregorianCalendar dataPrenotazione;
	protected GregorianCalendar dataPrenotata;
}
