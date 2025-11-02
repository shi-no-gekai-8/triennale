package ex_05072021;

import java.util.ArrayList;

public class LavoratoreTester {
	public static void main(String[] args) {
		ArrayList<Lavoratore> listaLavoratori = new ArrayList<Lavoratore>();
		LavoratoreRetribuitoOre l1 = new LavoratoreRetribuitoOre("Alfonso Zappia", 35, 10);
		LavoratoreRetribuitoOre l2 = new LavoratoreRetribuitoOre("Davide Amitrano", 36, 11);
		LavoratoreRetribuitoOre l3 = new LavoratoreRetribuitoOre("Antonio Dalia", 37, 12);
		LavoratoreRetribuitoOre l4 = new LavoratoreRetribuitoOre("Vincenzo Esposito", 38, 13);
		LavoratoreRetribuitoOre l5 = new LavoratoreRetribuitoOre("Gerardo Donnarumma", 39, 14);
		LavoratoreRetribuitoOre l6 = new LavoratoreRetribuitoOre("Donato Miranda", 40, 15);
		LavoratoreRetribuitoOre l7 = new LavoratoreRetribuitoOre("Lorenzo Insigne", 41, 16);
		LavoratoreRetribuitoOre l8 = new LavoratoreRetribuitoOre("Harry Potter", 34, 17);
		LavoratoreRetribuitoOre l9 = new LavoratoreRetribuitoOre("Thanos", 33, 18);
		LavoratoreRetribuitoOre l10 = new LavoratoreRetribuitoOre("Tony Stark", 32, 19);
		LavoratoreRetribuitoSettimanalmente l11 = new LavoratoreRetribuitoSettimanalmente("Hermione Granger", 20);
		LavoratoreRetribuitoSettimanalmente l12 = new LavoratoreRetribuitoSettimanalmente("Ron Weasley", 21);
		LavoratoreRetribuitoSettimanalmente l13 = new LavoratoreRetribuitoSettimanalmente("Antonio Giorgio", 22);
		LavoratoreRetribuitoSettimanalmente l14 = new LavoratoreRetribuitoSettimanalmente("Ida Persico", 100);
		LavoratoreRetribuitoSettimanalmente l15 = new LavoratoreRetribuitoSettimanalmente("Umberto Ferrara", 23);
		LavoratoreRetribuitoSettimanalmente l16 = new LavoratoreRetribuitoSettimanalmente("Alfonso Piccolo", 24);
		LavoratoreRetribuitoSettimanalmente l17 = new LavoratoreRetribuitoSettimanalmente("Luca de Martino", 25);
		LavoratoreRetribuitoSettimanalmente l18 = new LavoratoreRetribuitoSettimanalmente("Antonio Oliva", 26);
		LavoratoreRetribuitoSettimanalmente l19 = new LavoratoreRetribuitoSettimanalmente("Rosalia Torino", 27);
		LavoratoreRetribuitoSettimanalmente l20 = new LavoratoreRetribuitoSettimanalmente("Pier Paolo Zappia", 28);
		listaLavoratori.add(l1);
		listaLavoratori.add(l2);
		listaLavoratori.add(l3);
		listaLavoratori.add(l4);
		listaLavoratori.add(l5);
		listaLavoratori.add(l6);
		listaLavoratori.add(l7);
		listaLavoratori.add(l8);
		listaLavoratori.add(l9);
		listaLavoratori.add(l10);
		listaLavoratori.add(l11);
		listaLavoratori.add(l12);
		listaLavoratori.add(l13);
		listaLavoratori.add(l14);
		listaLavoratori.add(l15);
		listaLavoratori.add(l16);
		listaLavoratori.add(l17);
		listaLavoratori.add(l18);
		listaLavoratori.add(l19);
		listaLavoratori.add(l20);
		for(Lavoratore lavoratore: listaLavoratori) {
			System.out.println("Nome: "+lavoratore.getNome()+", Paga: "+lavoratore.calcolaPaga(lavoratore.getNumeroOre(), lavoratore.getTariffaOraria()));
		}
	}

}
