package ex_11072021;

public class GiaLocatoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public GiaLocatoException() {
		super("Problemi con il contratto");
	}
	public String toString() {
		return getMessage()+": il contratto è già locato";
	}
}
