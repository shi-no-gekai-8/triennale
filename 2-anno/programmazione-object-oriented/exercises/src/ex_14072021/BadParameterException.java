package ex_14072021;

public class BadParameterException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public BadParameterException() {
		super("Problemi con il deposito");
	}
	public String toString() {
		return getMessage()+": l'importo non può essere negativo.";
	}
}
