package ex_12072021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Studente extends Registrazione {
	public Studente(int tipo, String nome, String cognome, Date dataRegistrazione, String nomeUniversita, Tipologia tipologia) throws BadDateException, ParseException {
		super(tipo, nome, cognome, dataRegistrazione);
		this.nomeUniversita = nomeUniversita;
		this.tipologia = tipologia;
	}
	public boolean isInRitardo() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataRit = sdf.parse("2020-01-31");
		if(super.dataRegistrazione.after(dataRit)) {
			return true;
		}
		return false;
	}
	public double calcolaCosto() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataRit = sdf.parse("2020-01-31");
		if(super.dataRegistrazione.before(dataRit)) {
			return 250;
		}
		return 300;
	}
	public String getNomeUniversita() {
		return nomeUniversita;
	}
	public void setNomeUniversita(String nomeUniversita) {
		this.nomeUniversita = nomeUniversita;
	}
	public Tipologia getTipologia() {
		return tipologia;
	}
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	public String toString() {
		return " -- STUDENTE -- [Nome: "+nome+", Cognome: "+cognome+", Data: "+dataRegistrazione+", Università: "+nomeUniversita+", Tipologia: "+tipologia;
	}
	private String nomeUniversita;
	private Tipologia tipologia;
}
