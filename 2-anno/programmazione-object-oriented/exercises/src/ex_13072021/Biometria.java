package ex_13072021;

import java.util.GregorianCalendar;

public abstract class Biometria {
	
	public Biometria(GregorianCalendar dataCreazione, String strumentoMisurazione) {
		this.dataCreazione = dataCreazione;
		this.strumentoMisurazione = strumentoMisurazione;
	}
	public GregorianCalendar getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(GregorianCalendar dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public String getStrumentoMisurazione() {
		return strumentoMisurazione;
	}
	public void setStrumentoMisurazione(String strumentoMisurazione) {
		this.strumentoMisurazione = strumentoMisurazione;
	}

	protected GregorianCalendar dataCreazione;
	protected String strumentoMisurazione;
}
