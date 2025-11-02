package ex_06072021;

public class Manager extends Personale {
	
	public Manager(String nome, double retribuzione, String incarico, String areaCompetenza) {
		super(nome, retribuzione);
		this.incarico = incarico;
		this.areaCompetenza = areaCompetenza;
	}
	public String toString() {
		return "Nome: "+super.nome+", Retribuzione: "+super.retribuzione+", Incarico: "+incarico+", Area di Competenza: "+areaCompetenza;
	}
	private String incarico;
	private String areaCompetenza;
}
