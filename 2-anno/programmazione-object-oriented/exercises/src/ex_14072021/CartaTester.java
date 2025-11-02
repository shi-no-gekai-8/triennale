package ex_14072021;

public class CartaTester {
	public static void main(String[] args) {
		IstitutoBancario listaAccount = new IstitutoBancario();
		BankAccount b1 = new BankAccount(50);
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		CartaDiCredito c1 = new CartaDiCredito("Alfonso Zappia", "4485247504483606", b1, "Visa");
		CartaDiCredito c2 = new CartaDiCredito("Tony Stark", "4929138418200554", b2, "Visa");
		CartaDiCredito c3 = new CartaDiCredito("Harry Potter", "4024007102856456", b3, "Visa");
		listaAccount.aggiungiCartaDiCredito(c1);
		listaAccount.aggiungiCartaDiCredito(c2);
		listaAccount.aggiungiCartaDiCredito(c3);
		GraficaCarta grafica = new GraficaCarta(listaAccount);
		System.out.println(c1.toString());
	}
}
