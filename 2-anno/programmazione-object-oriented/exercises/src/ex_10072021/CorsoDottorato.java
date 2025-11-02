package ex_10072021;

public class CorsoDottorato extends Corso {
	public CorsoDottorato(String nome, String docente, String lingua, int oreLezioni) {
		super(nome, docente);
		this.lingua = lingua;
		this.oreLezioni = oreLezioni;
	}
	@Override
	public int dammiNumeroCFU() {
		return oreLezioni/4;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	@Override
	public double calcolaCosto() {
		if(lingua.equalsIgnoreCase("Inglese")) {
			return (oreLezioni*50)*2;
		}
		return oreLezioni*50;
	}
	@Override
	public int getOre() {
		return oreLezioni;
	}
	@Override
	public String toString() {
		return "-- Corso Dottorato -- Nome: "+nome+", Docente: "+docente+", Lingua: "+lingua+", Ore Lezione: "+oreLezioni;
	}
	private String lingua;
	private int oreLezioni;
}
