package ex_05072021;

public class Studente extends Persona {
	public Studente(String nome, int annoNascita, String specializzazione) {
		super(nome, annoNascita);
		this.specializzazione = specializzazione;
	}
	
	@Override
	public String toString() {
		return "Studente [specializzazione=" + specializzazione + ", nome=" + nome + ", annoNascita=" + annoNascita
				+ "]";
	}

	private String specializzazione;
}
