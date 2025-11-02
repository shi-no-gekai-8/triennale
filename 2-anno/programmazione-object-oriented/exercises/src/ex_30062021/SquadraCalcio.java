package ex_30062021;

public class SquadraCalcio {
	
	public SquadraCalcio(String nome, String cognome, String ruolo, int passaggiSbagliati, int retrocessioni, int illecitiSportivi, int numeroCampionatiVintiImmeritatamente, int numeroPartite) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.passaggiSbagliati = passaggiSbagliati;
		this.retrocessioni = retrocessioni;
		this.illecitiSportivi = illecitiSportivi;
		this.numeroCampionatiVintiImmeritatamente = numeroCampionatiVintiImmeritatamente;
		this.numeroPartite = numeroPartite;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getRetrocessioni() {
		return retrocessioni;
	}
	public int getIllecitiSportivi() {
		return illecitiSportivi;
	}
	public int getNumeroCampionatiVintiImmeritatamente() {
		return numeroCampionatiVintiImmeritatamente;
	}
	public int getNumeroPartite() {
		return numeroPartite;
	}
	
	public void setNumeroPartite(int numeroPartite) {
		this.numeroPartite = numeroPartite;
	}
	public void incrementaIlleciti() {
		illecitiSportivi++;
	}
	public void incrementaCampionati() {
		numeroCampionatiVintiImmeritatamente++;
	}
	
	@Override
	public String toString() {
		return "SquadraCalcio [nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo + ", passaggiSbagliati="
				+ passaggiSbagliati + ", retrocessioni=" + retrocessioni + ", illecitiSportivi=" + illecitiSportivi
				+ ", numeroCampionatiVintiImmeritatamente=" + numeroCampionatiVintiImmeritatamente + ", numeroPartite="
				+ numeroPartite + "]";
	}

	private String nome;
	private String cognome;
	private String ruolo;
	private int passaggiSbagliati;
	private int retrocessioni;
	private int illecitiSportivi;
	private int numeroCampionatiVintiImmeritatamente;
	private int numeroPartite;
}
