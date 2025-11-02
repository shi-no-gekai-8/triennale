package ex_05072021;

public class LavoratoreRetribuitoOre extends Lavoratore {
	
	public LavoratoreRetribuitoOre(String nome, int numeroOre, double tariffaOraria) {
		super(nome);
		this.numeroOre = numeroOre;
		this.tariffaOraria = tariffaOraria;
	}
	public double calcolaPaga(int oreLavorate, double tariffa) {
		double paga = oreLavorate*tariffa;
		if(oreLavorate>40) {
			int oreStraordinario = oreLavorate-40;
			double pagaStraordinario = paga + (oreStraordinario*1.5);
			return pagaStraordinario;
		}
		return paga;
	}
	
	public int getNumeroOre() {
		return numeroOre;
	}
	public double getTariffaOraria() {
		return tariffaOraria;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+", Ore: "+numeroOre+", Tariffa Oraria: "+tariffaOraria;
	}

	private int numeroOre;
	private double tariffaOraria;
}
