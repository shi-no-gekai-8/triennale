package ex_12072021;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Registrazione {
	public Registrazione(int tipo, String nome, String cognome, Date dataRegistrazione) throws ParseException {
		this.tipo = tipo;
		this.nome = nome;
		this.cognome = cognome;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		this.dataRegistrazione = dataRegistrazione;
		Date dataMax = sdf.parse("2020-04-30");
		try {
			if(dataRegistrazione.after(dataMax)) {
				throw new BadDateException();
			}
		} catch(BadDateException e) {
			System.out.println(e.toString());
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public abstract String toString();
	public abstract boolean isInRitardo() throws ParseException;
	public abstract double calcolaCosto() throws ParseException;
	protected int tipo;
	protected String nome;
	protected String cognome;
	protected Date dataRegistrazione;
}
