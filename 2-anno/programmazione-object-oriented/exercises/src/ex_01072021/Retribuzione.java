package ex_01072021;

public class Retribuzione {
	public Retribuzione(String nomeCognome, double tariffaOraria) {
		this.nomeCognome = nomeCognome;
		this.tariffaOraria = tariffaOraria;
		this.oreStraordinario = 0;
	}
	public int calcolaPagamento(int ore) {
		int pagamento=0;
		int straordinario=0;
		if(ore <= 40) {
			pagamento = (int) (ore*tariffaOraria);
			straordinario = 0;
		} else {
			if(straordinario+oreStraordinario >= 30) {
				System.out.println(nomeCognome+" ha lavorato per 30 ore di straordinario");
				oreStraordinario = straordinario;
			}
		}
		return pagamento;
	}
	public String getNomeCognome() {
		return nomeCognome;
	}
	
	public double getTariffaOraria() {
		return tariffaOraria;
	}
	private String nomeCognome;
	private double tariffaOraria;
	private int oreLavoro;
	private int oreStraordinario;
}
