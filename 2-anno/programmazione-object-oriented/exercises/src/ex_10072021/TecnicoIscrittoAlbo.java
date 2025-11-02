package ex_10072021;

import java.util.ArrayList;
import java.util.Arrays;

public class TecnicoIscrittoAlbo extends Tecnico {
	
	public TecnicoIscrittoAlbo(String matricola, String nome, String cognome, String specializzazione) {
		super(matricola, nome, cognome);
		numeroIncontri = 0;
		this.specializzazione = specializzazione;
		listaClienti = new ArrayList<Cliente>();
	}
	
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	public void setListaClienti(ArrayList<Cliente> listaClienti) {
		this.listaClienti = listaClienti;
	}
	public void assisti(Cliente c) {
		listaClienti.add(c);
		c.setNumeroRelazioniTecnicheOttenute(c.getNumeroRelazioniTecnicheOttenute()+1);
	}
	public void firma(Cliente c) {
		listaClienti.remove(c);
		c.setNumeroRelazioniTecnicheOttenute(c.getNumeroRelazioniTecnicheOttenute()+1);
	}
	public String toString() {
		return "Matricola: "+matricola+", Nome: "+nome+", Cognome: "+cognome+", Specializzazione: "+specializzazione+", Numero Incontri: "+numeroIncontri;
	}
	private String specializzazione;
	private ArrayList<Cliente> listaClienti;
}
