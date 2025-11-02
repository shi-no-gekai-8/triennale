package ex_13072021;

public class TesserinoScadutoException extends Exception {
	private static final long serialVersionUID = 1L;
	public TesserinoScadutoException() {
		super("Problemi con il tesserino");
	}
	public String toString() {
		return getMessage()+": il tesserino è scaduto.";
	}
}
