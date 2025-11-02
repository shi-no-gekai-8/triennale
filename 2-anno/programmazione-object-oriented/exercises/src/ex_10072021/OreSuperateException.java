package ex_10072021;

public class OreSuperateException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public OreSuperateException() {
		super("Numero di ore massimo raggiunto.");
	}
}
