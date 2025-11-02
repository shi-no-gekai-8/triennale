package ex_30062021;

public class SegretarioCurioso {
	
	public SegretarioCurioso(String nome, String cognome, String corsoDiLaurea, int annoIscrizione, int numeroEsami, double mediaVoti) {
		this.nome = nome;
		this.cognome = cognome;
		this.corsoDiLaurea = corsoDiLaurea;
		this.annoIscrizione = annoIscrizione;
		this.numeroEsami = numeroEsami;
		this.mediaVoti = mediaVoti;
	}
	
	public int getAnnoIscrizione() {
		return annoIscrizione;
	}
	
	public void setNumTotaleDiEsami(int numTotaleDiEsami) {
		this.numTotaleDiEsami = numTotaleDiEsami;
	}
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getNumeroEsamiMancanti() {
		if(numeroEsami==numTotaleDiEsami) {
			System.out.println("Lo studente ha superato tutti gli esami");
		}
		int numeroEsamiMancanti = numTotaleDiEsami-numeroEsami;
		return numeroEsamiMancanti;
	}
	private String nome;
	private String cognome;
	private String corsoDiLaurea;
	private int annoIscrizione;
	private int numeroEsami;
	private double mediaVoti;
	private int numTotaleDiEsami;
}
