package ex_15072021;

public class BadIDException extends Exception {
	private static final long serialVersionUID = 1L;
	public BadIDException() {
		super("Problemi con l'identificazione");
	}
	public String toString() {
		return getMessage()+": il numero di identificazione del cliente non può essere negativo.";
	}
}
