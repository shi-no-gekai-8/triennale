package ex_05072021;

public class Insegnante extends Persona {
	public Insegnante(String nome, int annoNascita, double stipendio) {
		super(nome, annoNascita);
		this.stipendio = stipendio;
	}
	
	@Override
	public String toString() {
		return "Insegnante [stipendio=" + stipendio + ", nome=" + nome + ", annoNascita=" + annoNascita + "]";
	}

	private double stipendio;
}
