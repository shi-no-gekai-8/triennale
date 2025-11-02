package ex_06072021;
public class TestContenitore {

	public static void main(String[] args) {
		ElencoContenitori lotto = new ElencoContenitori();
		Contenitore c1 = new ContenitoreCubico("Scatola", 1, 20, 500, 10);
		Contenitore c2 = new ContenitoreCilindrico("Bacinella", 2, 30, 1000, 20);
		Contenitore c3 = new ContenitoreCubico("Ida", 3, 21, 501, 11);
		Contenitore c4 = new ContenitoreCilindrico("Persico", 4, 31, 1001, 21);
		lotto.addContenitore(c1);
		lotto.addContenitore(c2);
		lotto.addContenitore(c3);
		lotto.addContenitore(c4);
		lotto.sortPerNome();
		System.out.println(lotto.getFirstElement().toString());
		System.out.println(lotto.getLastElement().toString());
		lotto.sortPerCodice();
		System.out.println(lotto.getFirstElement().toString());
		System.out.println(lotto.getLastElement().toString());
	}

}
