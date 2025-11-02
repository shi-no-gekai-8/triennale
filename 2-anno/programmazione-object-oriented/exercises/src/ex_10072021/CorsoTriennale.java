package ex_10072021;

public class CorsoTriennale extends Corso {
	public CorsoTriennale(String nome, String docente, int numeroOreFrontali, int numeroOreLaboratorio) {
		super(nome, docente);
		this.numeroOreFrontali = numeroOreFrontali;	
		this.numeroOreLaboratorio = numeroOreLaboratorio;
	}
	@Override
	public int dammiNumeroCFU() {
		int calcolaLab = numeroOreLaboratorio/8;
		int calcolaFront = numeroOreFrontali/10;
		return calcolaLab+calcolaFront;
	}
	
	public int getnumeroOreLaboratorio() {
		return numeroOreLaboratorio;
	}
	public void setnumeroOreLaboratorio(int numeroOreLaboratorio) {
		this.numeroOreLaboratorio = numeroOreLaboratorio;
	}
	public int getNumeroOreFrontali() {
		return numeroOreFrontali;
	}
	public void setNumeroOreFrontali(int numeroOreFrontali) {
		this.numeroOreFrontali = numeroOreFrontali;
	}
	@Override
	public int getOre() {
		return numeroOreFrontali+numeroOreLaboratorio;
	}
	public String toString() {
		return "-- Corso Triennale -- Nome: "+nome+", Docente: "+docente+", Numero Ore Frontali: "+numeroOreFrontali+"Numero Ore Laboratorio: "+numeroOreLaboratorio;
	}
	@Override
	public double calcolaCosto() {
		int calcLab = numeroOreLaboratorio*35;
		int calcFront = numeroOreFrontali*50;
		return calcLab+calcFront;
	}
	private int numeroOreLaboratorio;
	private int numeroOreFrontali;
}
