package ex_15072021;

import java.util.Objects;

public abstract class Film {
	public Film(int codice, String titolo, int giorniRitardo) {
		this.codice = codice;
		this.titolo = titolo;
		this.giorniRitardo = giorniRitardo;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getGiorniRitardo() {
		return giorniRitardo;
	}
	public void setGiorniRitardo(int giorniRitardo) {
		this.giorniRitardo = giorniRitardo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return codice == other.codice && giorniRitardo == other.giorniRitardo && Objects.equals(titolo, other.titolo);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public abstract double calcolaPenaleRitardo(int numeroGiorniRitardo);
	public abstract String toString();
	protected int giorniRitardo;
	protected int codice;
	protected String titolo;
}
