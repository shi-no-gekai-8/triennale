package ex_01072021;

public class Month {
	
	public Month(int giorni, String nome) {
		this.giorni = giorni;
		this.nome = nome;
	}
	
	public int getGiorni() {
		return giorni;
	}
	public String getNome() {
		return nome;
	}

	private int giorni;
	private String nome;
}
