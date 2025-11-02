package ex_05072021;

public class LavoratoreRetribuitoSettimanalmente extends Lavoratore {
	public LavoratoreRetribuitoSettimanalmente(String nome, double tariffaSettimanale) {
		super(nome);
		this.tariffaSettimanale = tariffaSettimanale;
	}
	
	public double calcolaPaga(int ore, double tariffa) {
		ore = 40;
		tariffa = tariffaSettimanale;
		return tariffa;
	}
	public int getNumeroOre() {
		return 40;
	}
	public double getTariffaOraria() {
		return tariffaSettimanale;
	}
	private double tariffaSettimanale;
}
