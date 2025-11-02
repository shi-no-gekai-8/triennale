package ex_11072021;

public abstract class Contratto {
	
	public Contratto(String nomeLocatore, String indirizzoMobile) {
		this.nomeLocatore = nomeLocatore;
		this.indirizzoMobile = indirizzoMobile;
		locato = false;
	}

	public String getNomeLocatore() {
		return nomeLocatore;
	}
	public void setNomeLocatore(String nomeLocatore) {
		this.nomeLocatore = nomeLocatore;
	}
	public String getNomeConduttore() {
		return nomeConduttore;
	}
	public void setNomeConduttore(String nomeConduttore) {
		this.nomeConduttore = nomeConduttore;
	}
	public String getIndirizzoMobile() {
		return indirizzoMobile;
	}
	public void setIndirizzoMobile(String indirizzoMobile) {
		this.indirizzoMobile = indirizzoMobile;
	}
	public boolean isLocato() {
		return locato;
	}
	public void setLocato(boolean locato) {
		this.locato = locato;
	}
	public abstract double calcolaAffitto();
	public abstract double calcolaTasse();
	protected String nomeLocatore;
	protected String nomeConduttore;
	protected String indirizzoMobile;
	protected boolean locato;
}
