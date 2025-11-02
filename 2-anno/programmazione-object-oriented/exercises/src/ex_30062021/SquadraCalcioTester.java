package ex_30062021;

public class SquadraCalcioTester {

	public static void main(String[] args) {
		SquadraCalcio giocatore1 = new SquadraCalcio("Leonardo", "Bonucci", "Difensore", 100, 1, 1, 34, 596);
		SquadraCalcio giocatore2 = new SquadraCalcio("Giorgio", "Chiellini", "Difensore", 160, 2, 2, 34, 645);
		System.out.println("## "+giocatore1.getNome()+" "+giocatore1.getCognome()+"## Numero illeciti: "+giocatore1.getIllecitiSportivi()+" - Numero Campionati vinti immeritatamente: "+giocatore1.getNumeroCampionatiVintiImmeritatamente());
		System.out.println("## "+giocatore2.getNome()+" "+giocatore2.getCognome()+"## Numero illeciti: "+giocatore2.getIllecitiSportivi()+" - Numero Campionati vinti immeritatamente: "+giocatore2.getNumeroCampionatiVintiImmeritatamente());
		giocatore1.setNumeroPartite(0);
		giocatore2.incrementaCampionati();
		System.out.println("Nuovi dati.");
		System.out.println(giocatore1.toString());
		System.out.println(giocatore2.toString());
	}

}
