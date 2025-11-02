package ex_13072021;

public class PesoMaxSuperatoException extends Exception {
	private static final long serialVersionUID = 1L;
	public PesoMaxSuperatoException() {
		super("Problemi con la slitta");
	}
	public String toString() {
		return getMessage()+": peso massimo superato.";
	}
}
