package ex_06072021;

import java.util.Objects;

public abstract class Contenitore {
	
	public Contenitore(String nome, int codice, double prezzo, double capienza) {
		this.nome = nome;
		this.codice = codice;
		this.prezzo = prezzo;
		this.capienza = capienza;
	}
	
	@Override
	public String toString() {
		return "Contenitore [nome=" + nome + ", codice=" + codice + ", prezzo=" + prezzo + ", capienza=" + capienza
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contenitore other = (Contenitore) obj;
		return Double.doubleToLongBits(capienza) == Double.doubleToLongBits(other.capienza) && codice == other.codice
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getCapienza() {
		return capienza;
	}
	public void setCapienza(double capienza) {
		this.capienza = capienza;
	}

	protected String nome;
	protected int codice;
	protected double prezzo;
	protected double capienza;
}
