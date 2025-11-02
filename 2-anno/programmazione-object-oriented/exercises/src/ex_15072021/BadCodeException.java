package ex_15072021;

public class BadCodeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public BadCodeException() {
		super("Problemi con l'inserimento");
	}
	public String toString() {
		return getMessage()+": il film è già presente nell'archivio.";
	}
}
