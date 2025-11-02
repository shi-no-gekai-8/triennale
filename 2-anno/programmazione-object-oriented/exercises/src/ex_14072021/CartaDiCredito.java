package ex_14072021;

public class CartaDiCredito {
	public CartaDiCredito(String nome, String numero, BankAccount contoBancario, String circuito) {
		this.nome = nome;
		this.numero = numero;
		this.contoBancario = contoBancario;
		this.circuito = circuito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BankAccount getContoBancario() {
		return contoBancario;
	}
	public void setContoBancario(BankAccount contoBancario) {
		this.contoBancario = contoBancario;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public String toString() {
		return "Nome: "+nome+", Numero: "+numero+", Totale Conto: "+contoBancario.getBalance()+", Circuito: "+circuito;
	}
	private String nome;
	private String numero;
	private BankAccount contoBancario;
	private String circuito;
}
