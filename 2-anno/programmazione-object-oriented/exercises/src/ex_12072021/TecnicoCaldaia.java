package ex_12072021;

import java.util.ArrayList;

public class TecnicoCaldaia extends Idraulico {
	public TecnicoCaldaia(String matricola, String nome, String cognome, TipiInterventi tipoInterventoEffettuato, ArrayList<String> caseCostruttrici, int giudizio) {
		super(matricola, nome, cognome, tipoInterventoEffettuato);
		caseCostruttrici = new ArrayList<String>();
		caseCostruttrici.add("Vaillant");
		caseCostruttrici.add("Immergas");
		caseCostruttrici.add("Beretta");
		caseCostruttrici.add("Baxi");
		caseCostruttrici.add("Junkers");
		this.giudizio = giudizio;
		certificato = false;
	}
	public ArrayList<String> getCaseCostruttrici() {
		return caseCostruttrici;
	}
	public void setCaseCostruttrici(ArrayList<String> caseCostruttrici) {
		this.caseCostruttrici = caseCostruttrici;
	}
	public int getGiudizioMedio() {
		return giudizio;
	}
	public void setGiudizioMedio(int giudizio) {
		this.giudizio = giudizio;
	}
	public boolean isCertificato() {
		return certificato;
	}
	public void setCertificato(boolean certificato) {
		this.certificato = certificato;
	}
	public void certifica(String matricola, String casaCostruttrice) {
		if(caseCostruttrici.contains(casaCostruttrice)) {
			certificato = true;
		}
	}
	public void effettuaIntervento(String casaCostruttrice, double giudizioMedio) throws IdraulicoNonCertificatoException {
		if(certificato) {
			throw new IdraulicoNonCertificatoException();
		}
		super.numeroInterventiEffettuati++;
	}
	private ArrayList<String> caseCostruttrici;
	private int giudizio;
	private boolean certificato;
}
