package ex_13072021;


public class MostroDiAcqua extends Mostro {
	public MostroDiAcqua(String nome, double livelloEnergia, double vitalita, double temperatura) {
		super(nome, livelloEnergia, vitalita);
		this.temperatura = temperatura;
	}
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public void attacca(Mostro m) {
		try {
			if(m instanceof MostroDiFuoco) {
				throw new MostroDiAcquaException();
			} else if(m instanceof MostroDiPietra && super.vitalita>0 && super.livelloEnergia >= temperatura/2) {
				super.setLivelloEnergia(super.livelloEnergia-(temperatura/2));
				m.difendi();
			}
		} catch(MostroDiAcquaException e) {
			System.out.println(e.toString());
		}
	}
	public void difendi() {
		super.vitalita--;
	}
	public String toString() {
		return "--- MOSTRO DI ACQUA --- Nome: "+nome+", Livello di Energia: "+livelloEnergia+", Vitalità: "+vitalita+", Temperatura: "+temperatura;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MostroDiAcqua other = (MostroDiAcqua) obj;
		return Double.doubleToLongBits(temperatura) == Double.doubleToLongBits(other.temperatura);
	}

	private double temperatura;
}	
