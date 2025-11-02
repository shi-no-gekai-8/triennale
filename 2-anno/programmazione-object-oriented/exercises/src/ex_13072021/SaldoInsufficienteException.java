package ex_13072021;

public class SaldoInsufficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public SaldoInsufficienteException() {
		super("Problemi con il saldo");
	}
	public String toString() {
		return getMessage()+": il saldo è insufficiente.";
	}
}
