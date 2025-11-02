package ex_13072021;

public class WrongIrisCodeException extends Exception {
	private static final long serialVersionUID = 1L;
	public WrongIrisCodeException() {
		super("Problema con il codice identificativo: ");
	}
	public String toString() {
		return getMessage()+": deve essere una stringa di 6 caratteri.";
	}
}
