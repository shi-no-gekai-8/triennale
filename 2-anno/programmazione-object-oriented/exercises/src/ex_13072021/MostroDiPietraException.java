package ex_13072021;

public class MostroDiPietraException extends Exception {
	private static final long serialVersionUID = 1L;
	public MostroDiPietraException() {
		super("Problemi con il combattimento");
	}
	public String toString() {
		return getMessage()+": il mostro di pietra non può attaccare il mostro di acqua.";
	}
}
