package ex_12072021;

public class RegistrationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public RegistrationException() {
		super("Problema con la registrazione");
	}
	public String toString() {
		return getMessage()+": questo membro è già registrato.";
	}
}
