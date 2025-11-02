package ex_10072021;

import java.util.ArrayList;
import java.util.Random;

public class TecnicoNonIscrittoAlbo extends Tecnico {
	
	public TecnicoNonIscrittoAlbo(String matricola, String nome, String cognome) {
		super(matricola, nome, cognome);
		numeroIncontri = 0;
		listaClienti = new ArrayList<Cliente>();
		listaCertificati = new ArrayList<String>();
		listaCertificati.add("Certificato A");
		listaCertificati.add("Certificato B");
		listaCertificati.add("Certificato C");
		listaCertificati.add("Certificato D");
		listaCertificati.add("Certificato E");
	}
	public ArrayList<Cliente> getListaClienti() {
		return listaClienti;
	}
	public void setListaClienti(ArrayList<Cliente> listaClienti) {
		this.listaClienti = listaClienti;
	}
	public void assisti(Cliente c) {
		c.setNumeroRelazioniTecnicheOttenute(c.getNumeroRelazioniTecnicheOttenute()+1);
		Random generator = new Random();
		int certificato = generator.nextInt(4);
		c.getListaDocumentiConsegnare().add(listaCertificati.get(certificato));
	}
	public String toString() {
		return "Matricola: "+matricola+", Nome: "+nome+", Cognome: "+cognome+", Numero Incontri: "+numeroIncontri;
	}
	private ArrayList<Cliente> listaClienti;
	private ArrayList<String> listaCertificati;
}
