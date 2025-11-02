package ex_11072021;

public class NumMaxException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public NumMaxException() {
		super("Problema con i residenti");
	}
	public String toString() {
		return getMessage()+": superato numero massimo persone.";
	}
}
