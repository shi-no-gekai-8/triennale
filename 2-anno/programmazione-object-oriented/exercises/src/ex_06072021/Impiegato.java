package ex_06072021;

public class Impiegato extends Personale {
	
	public Impiegato(String nome, double retribuzione, String incarico) {
		super(nome, retribuzione);
		this.incarico = incarico;
	}
	public String toString() {
		return "Nome: "+super.nome+", Retribuzione: "+super.retribuzione+", Incarico: "+incarico;
	}
	private String incarico;
}
