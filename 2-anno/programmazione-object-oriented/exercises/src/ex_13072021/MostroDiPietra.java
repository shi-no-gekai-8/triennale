package ex_13072021;

public class MostroDiPietra extends Mostro {
	public MostroDiPietra(String nome, double livelloEnergia, double vitalita, double peso) {
		super(nome, livelloEnergia, vitalita);
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void attacca(Mostro m) {
		try {
			if(m instanceof MostroDiAcqua) {
				throw new MostroDiPietraException();
			} else if(m instanceof MostroDiFuoco && super.vitalita>0 && super.livelloEnergia >= peso/3) {
				super.setLivelloEnergia(super.livelloEnergia-(peso/3));
				m.difendi();
			}
		} catch(MostroDiPietraException e) {
			System.out.println(e.toString());
		}
	}
	public void difendi() {
		super.vitalita--;
	}
	public String toString() {
		return "--- MOSTRO DI PIETRA --- Nome: "+nome+", Livello di Energia: "+livelloEnergia+", Vitalità: "+vitalita+", Peso: "+peso;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MostroDiPietra other = (MostroDiPietra) obj;
		return Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	private double peso;
}
