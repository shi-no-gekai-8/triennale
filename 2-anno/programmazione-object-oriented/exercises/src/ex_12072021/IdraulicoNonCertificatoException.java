package ex_12072021;

public class IdraulicoNonCertificatoException extends Exception {
	private static final long serialVersionUID = 1L;
	public IdraulicoNonCertificatoException() {
		super("Il tecnico della caldaia non presenta questa certificazione.");
	}
}
