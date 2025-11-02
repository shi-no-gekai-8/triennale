package ex_12072021;

public class BadDateException extends Exception{
	private static final long serialVersionUID = 1L;
	public BadDateException() {
		super("Problema con la data");
	}
	@Override
	public String toString() {
		return getMessage()+": non è possibile iscriversi dopo il 30 aprile";
	}
	
}
