package ex_13072021;

public class MostroDiFuocoException extends Exception {
	private static final long serialVersionUID = 1L;
	public MostroDiFuocoException() {
		super("Problemi con il combattimento");
	}
	public String toString() {
		return getMessage()+": il mostro di fuoco non può attaccare il mostro di pietra.";
	}
}
