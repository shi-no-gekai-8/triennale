package ex_12072021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Professionista extends Registrazione {
	
	public Professionista(int tipo, String nome, String cognome, Date dataRegistrazione, String nomeAzienda, String partitaIVA) throws BadDateException, ParseException {
		super(tipo, nome, cognome, dataRegistrazione);
		this.nomeAzienda = nomeAzienda;
		this.partitaIVA = partitaIVA;
	}
	public boolean isInRitardo() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataRit = sdf.parse("2020-02-03");
		if(super.dataRegistrazione.after(dataRit)) {
			return true;
		}
		return false;
	}
	public double calcolaCosto() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataRit = sdf.parse("2020-02-03");
		if(super.dataRegistrazione.before(dataRit)) {
			return 500;
		}
		return 550;
	}
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String toString() {
		return " -- STUDENTE -- [Nome: "+nome+", Cognome: "+cognome+", Data: "+dataRegistrazione+", Nome Azienda: "+nomeAzienda+", Tipologia: "+partitaIVA;
	}
	private String nomeAzienda;
	private String partitaIVA;
}
