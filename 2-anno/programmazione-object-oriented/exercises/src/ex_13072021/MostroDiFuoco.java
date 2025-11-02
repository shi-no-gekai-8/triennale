package ex_13072021;


public class MostroDiFuoco extends Mostro {
	
	public MostroDiFuoco(String nome, double livelloEnergia, double vitalita, double potenza) {
		super(nome, livelloEnergia, vitalita);
		this.potenza = potenza;
	}
	public double getPotenza() {
		return potenza;
	}

	public void setPotenza(double potenza) {
		this.potenza = potenza;
	}
	public void attacca(Mostro m) {
		try {
			if(m instanceof MostroDiPietra) {
				throw new MostroDiFuocoException();
			} else if(m instanceof MostroDiAcqua && super.vitalita>0 && super.livelloEnergia>=potenza) {
				super.setLivelloEnergia(super.livelloEnergia-potenza);
				m.difendi();
			}
		} catch(MostroDiFuocoException e) {
			System.out.println(e.toString());
		}
	}
	public void difendi() {
		super.vitalita--;
	}
	public String toString() {
		return "--- MOSTRO DI FUOCO --- Nome: "+nome+", Livello di Energia: "+livelloEnergia+", Vitalità: "+vitalita+", Potenza: "+potenza;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MostroDiFuoco other = (MostroDiFuoco) obj;
		return Double.doubleToLongBits(potenza) == Double.doubleToLongBits(other.potenza);
	}

	private double potenza;
}
