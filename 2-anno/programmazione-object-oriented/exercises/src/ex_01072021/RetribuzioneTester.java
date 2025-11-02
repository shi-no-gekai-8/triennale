package ex_01072021;

import java.util.Scanner;

public class RetribuzioneTester {

	public static void main(String[] args) {
		Retribuzione dipendente1 = new Retribuzione("Alfonso Zappia", 20);
		int pagamento = dipendente1.calcolaPagamento(40);
		System.out.print(dipendente1.getNomeCognome());
		System.out.print(" ha guadagnato ");
		System.out.print(pagamento);
	}
}
