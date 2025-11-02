package ex_13072021;

public abstract class Tesserino {
	
	public Tesserino(int codice, String nome, String cognome) {
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		attivo = true;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public boolean attiva() {
		try {
			if(!attivo) {
				throw new RuntimeException();
			}
		} catch(RuntimeException e) {
			System.out.println(e.toString());
		}
		return attivo = true;
	}
	public boolean disattiva() {
		try {
			if(attivo) {
				throw new RuntimeException();
			}
		} catch(RuntimeException e) {
			System.out.println(e.toString());
		}
		return attivo = false;
	}
	protected int codice;
	protected String nome;
	protected String cognome;
	protected boolean attivo;
}
