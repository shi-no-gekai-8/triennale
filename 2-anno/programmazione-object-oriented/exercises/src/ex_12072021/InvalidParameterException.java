package ex_12072021;

public class InvalidParameterException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidParameterException() {
		super("Parametri non validi");
	}
}
