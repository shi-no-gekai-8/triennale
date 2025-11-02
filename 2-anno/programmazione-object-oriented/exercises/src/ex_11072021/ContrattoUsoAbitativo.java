package ex_11072021;

public class ContrattoUsoAbitativo extends Contratto {
	
	public ContrattoUsoAbitativo(String nomeLocatore, String indirizzoMobile, int numeroVani, int piano, int numeroPersoneResidenti) {
		super(nomeLocatore, indirizzoMobile);
		locato = false;
		this.numeroVani = numeroVani;
		this.piano = piano;
		this.numeroPersoneResidenti = numeroPersoneResidenti;
	}
	public int getNumeroVani() {
		return numeroVani;
	}

	public void setNumeroVani(int numeroVani) {
		this.numeroVani = numeroVani;
	}

	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	public int getNumeroPersoneResidenti() {
		return numeroPersoneResidenti;
	}
	public void setNumeroPersoneResidenti(int numeroPersoneResidenti) throws NumMaxException {
		try {
			this.numeroPersoneResidenti = numeroPersoneResidenti;
			if(numeroPersoneResidenti>(numeroVani)*4) {
				throw new NumMaxException();
			}
		} catch(NumMaxException e) {
			e.printStackTrace();
		}
	}
	public double calcolaAffitto() {
		return numeroVani*130;
	}
	public double calcolaTasse() {
		double tari = numeroVani*100;
		double tasi = numeroPersoneResidenti*35;
		double condominio = numeroVani*10;
		return tari+tasi+condominio;
	}
	public String toString() {
		return "Nome del Locatore: "+nomeLocatore+", Nome Conduttore: "+nomeConduttore+", Indirizzo: "+indirizzoMobile+", Numero di Vani: "+numeroVani+", Piano: "+piano+", Numero di Residenti: "+numeroPersoneResidenti;
	}
	private int numeroVani;
	private int piano;
	private int numeroPersoneResidenti;
}
