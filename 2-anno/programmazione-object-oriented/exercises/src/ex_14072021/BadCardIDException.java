package ex_14072021;

public class BadCardIDException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public BadCardIDException() {
		super("Problemi con l'aggiunta");
	}
	public String toString() {
		return getMessage()+": questa carta è già presente nella lista.";
	}
}
