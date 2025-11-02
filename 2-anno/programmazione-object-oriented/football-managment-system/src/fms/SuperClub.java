package fms;
/**
 * 
 * @author Alfonso Zappia
 *
 */
public abstract class SuperClub {
	@Override
	public boolean equals(Object obj) {
		return this.nome.equals(((SuperClub)obj).nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStadio() {
		return stadio;
	}
	public void setStadio(String stadio) {
		this.stadio = stadio;
	}
	public String getStatistiche() {
		return statistiche;
	}
	public void setStatistiche(String statistiche) {
		this.statistiche = statistiche;
	}
	public String toString() {
		return "Nome: "+nome+", Stadio: "+stadio;
	}
	protected String nome;
	protected String stadio;
	protected String statistiche;
}
