package ex_30062021;

public class Curling {
	
	public Curling(String nome, String cognome, String ruolo, int partiteGiocate, int numeroInfortuni, double spesaPartite) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.partiteGiocate = partiteGiocate;
		this.numeroInfortuni = numeroInfortuni;
		this.spesaPartite = spesaPartite;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getPartiteGiocate() {
		return partiteGiocate;
	}
	public double getSpesaPartite() {
		return spesaPartite;
	}
	public int aggiungiPartita() {
		int nuovoNumeroPartite = partiteGiocate+1;
		return nuovoNumeroPartite;
	}
	
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	public int getNumeroInfortuni() {
		return numeroInfortuni;
	}

	public int aggiungiNumeroInfortuni() {
		int nuovoNumeroInfortuni = numeroInfortuni+1;
		return nuovoNumeroInfortuni;
	}
	
	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	
	public void setSpesaPartite(double spesaPartite) {
		this.spesaPartite = spesaPartite;
	}
	
	public void setNumeroInfortuni(int numeroInfortuni) {
		this.numeroInfortuni = numeroInfortuni;
	}
	
	@Override
	public String toString() {
		return "Curling [nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo + ", partiteGiocate="
				+ partiteGiocate + ", numeroInfortuni=" + numeroInfortuni + ", spesaPartite=" + spesaPartite + "]";
	}

	private String nome;
	private String cognome;
	private String ruolo;
	private int partiteGiocate;
	private int numeroInfortuni;
	private double spesaPartite;
}
