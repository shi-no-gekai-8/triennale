package ex_06072021;
public class ContenitoreCilindrico extends Contenitore {
	
	public ContenitoreCilindrico(String nome, int codice, double prezzo, double capienza, double raggio) {
		super(nome, codice, prezzo, capienza);
		this.raggio = raggio;
	}
	
	@Override
	public String toString() {
		return "ContenitoreCilindrico [raggio=" + raggio + ", nome=" + nome + ", codice=" + codice + ", prezzo="
				+ prezzo + ", capienza=" + capienza + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContenitoreCilindrico other = (ContenitoreCilindrico) obj;
		return Double.doubleToLongBits(raggio) == Double.doubleToLongBits(other.raggio);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private double raggio;
}
