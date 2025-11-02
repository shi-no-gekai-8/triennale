package ex_10072021;

public class TitoloNonPresenteException extends Exception {
	private static final long serialVersionUID = 1L;
	public TitoloNonPresenteException() {
		super("Questo titolo non è presente all'interno della Libreria.");
	}
	public TitoloNonPresenteException(String msg) {
		super(msg);
	}
}
