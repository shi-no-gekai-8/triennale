package ex_13072021;

public class MostroDiAcquaException extends Exception {
	private static final long serialVersionUID = 1L;
	public MostroDiAcquaException() {
		super("Problemi con il combattimento");
	}
	public String toString() {
		return getMessage()+": il mostro di acqua non può attaccare il mostro di fuoco.";
	}
}
