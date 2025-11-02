package ex_06072021;

public class ContenitoreCubico extends Contenitore {
	public ContenitoreCubico(String nome, int codice, double prezzo, double capienza, double ampiezzaLato) {
		super(nome, codice, prezzo, capienza);
		this.ampiezzaLato=ampiezzaLato;
	}
	
	@Override
	public String toString() {
		return "ContenitoreCubico [ampiezzaLato=" + ampiezzaLato + ", nome=" + nome + ", codice=" + codice + ", prezzo="
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
		ContenitoreCubico other = (ContenitoreCubico) obj;
		return Double.doubleToLongBits(ampiezzaLato) == Double.doubleToLongBits(other.ampiezzaLato);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private double ampiezzaLato;
}
