package ex_01072021;

public class DistributoreTester {

	public static void main(String[] args) {
		DistributoreAutomatico cocacola = new DistributoreAutomatico("Coca Cola", 10);
		DistributoreAutomatico fanta = new DistributoreAutomatico("Fanta", 20);
		DistributoreAutomatico sprite = new DistributoreAutomatico("Sprite", 30);
		cocacola.compra();
		System.out.println("Ho comprato "+cocacola.getNomeBibita());
		System.out.println("**Aggiornamento Distributore**");
		System.out.println("Coca Cola: "+cocacola.getQuantita());
		System.out.println("Fanta: "+fanta.getQuantita());
		System.out.println("Sprite: "+sprite.getQuantita());
		System.out.println("Gettoni: "+cocacola.getGettoni());
		for(int i=0;i<5;i++) {
			fanta.compra();
		}
		System.out.println("**Aggiornamento Distributore**");
		System.out.println("Coca Cola: "+cocacola.getQuantita());
		System.out.println("Fanta: "+fanta.getQuantita());
		System.out.println("Sprite: "+sprite.getQuantita());
		System.out.println("Gettoni: "+fanta.getGettoni());
	}

}
