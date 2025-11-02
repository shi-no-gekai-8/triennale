package ex_11072021;

import java.util.Random;

public class ContrattoTester {

	public static void main(String[] args) throws NumMaxException, GiaLocatoException {
		Random generator = new Random();
		AgenziaImmobiliare listaContratti = new AgenziaImmobiliare("Zappia Brothers", 1000);
		ContrattoUsoAbitativo cua1 = new ContrattoUsoAbitativo("Alfonso Zappia", "Via Aosta", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua2 = new ContrattoUsoAbitativo("Carmine Gravino", "Via Agrigento", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua3 = new ContrattoUsoAbitativo("Davide Amitrano", "Via Alessandria", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua4 = new ContrattoUsoAbitativo("Harry Potter", "Via Ancona", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua5 = new ContrattoUsoAbitativo("Tom Riddle", "Via Arezzo", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua6 = new ContrattoUsoAbitativo("Albus Silente", "Via Ascoli Piceno", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua7 = new ContrattoUsoAbitativo("Minerva McGranitt", "Via Avellino", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua8 = new ContrattoUsoAbitativo("Ron Weasley", "Via Asti", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua9 = new ContrattoUsoAbitativo("Hermione Granger", "Via Bari", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		ContrattoUsoAbitativo cua10 = new ContrattoUsoAbitativo("Draco Malfoy", "Via Belluno", generator.nextInt(10-1)+1, generator.nextInt(10-1)+1, generator.nextInt(10-1)+1);
		listaContratti.aggiungiImmobile(cua1);
		listaContratti.aggiungiImmobile(cua2);
		listaContratti.aggiungiImmobile(cua3);
		listaContratti.aggiungiImmobile(cua4);
		listaContratti.aggiungiImmobile(cua5);
		listaContratti.aggiungiImmobile(cua6);
		listaContratti.aggiungiImmobile(cua7);
		listaContratti.aggiungiImmobile(cua8);
		listaContratti.aggiungiImmobile(cua9);
		listaContratti.aggiungiImmobile(cua10);
		System.out.println(cua1.toString());
		System.out.println(cua2.toString());
		System.out.println(cua3.toString());
		ContrattoUsoCommerciale cuc1 = new ContrattoUsoCommerciale("Tony Stark", "Via Benevento", generator.nextInt(200-50)+50, "Alto Impatto Ambientale");
		ContrattoUsoCommerciale cuc2 = new ContrattoUsoCommerciale("Steve Rogers", "Via Bergamo", generator.nextInt(200-50)+50, "Basso Impatto Ambientale");
		ContrattoUsoCommerciale cuc3 = new ContrattoUsoCommerciale("Bruce Banner", "Via Biella", generator.nextInt(200-50)+50, "Alto Impatto Ambientale");
		ContrattoUsoCommerciale cuc4 = new ContrattoUsoCommerciale("Natasha Romanoff", "Via Bologna", generator.nextInt(200-50)+50, "Basso Impatto Ambientale");
		ContrattoUsoCommerciale cuc5 = new ContrattoUsoCommerciale("Clint Burton", "Via Bolzano", generator.nextInt(200-50)+50, "Alto Impatto Ambientale");
		ContrattoUsoCommerciale cuc6 = new ContrattoUsoCommerciale("Thor Odinson", "Via Brescia", generator.nextInt(200-50)+50, "Basso Impatto Ambientale");
		ContrattoUsoCommerciale cuc7 = new ContrattoUsoCommerciale("Loki Laufeyson", "Via Brindisi", generator.nextInt(200-50)+50, "Alto Impatto Ambientale");
		ContrattoUsoCommerciale cuc8 = new ContrattoUsoCommerciale("Peter Parker", "Via Cagliari", generator.nextInt(200-50)+50, "Basso Impatto Ambientale");
		ContrattoUsoCommerciale cuc9 = new ContrattoUsoCommerciale("Steven Strange", "Via Catania", generator.nextInt(200-50)+50, "Alto Impatto Ambientale");
		ContrattoUsoCommerciale cuc10 = new ContrattoUsoCommerciale("Peter Quill", "Via Caserta", generator.nextInt(200-50)+50, "Basso Impatto Ambientale");
		listaContratti.aggiungiImmobile(cuc1);
		listaContratti.aggiungiImmobile(cuc2);
		listaContratti.aggiungiImmobile(cuc3);
		listaContratti.aggiungiImmobile(cuc4);
		listaContratti.aggiungiImmobile(cuc5);
		listaContratti.aggiungiImmobile(cuc6);
		listaContratti.aggiungiImmobile(cuc7);
		listaContratti.aggiungiImmobile(cuc8);
		listaContratti.aggiungiImmobile(cuc9);
		listaContratti.aggiungiImmobile(cuc10);
		listaContratti.printAllElements();
		System.out.println(cua1.calcolaAffitto());
		System.out.println(cua1.calcolaTasse());
		System.out.println(cuc1.calcolaAffitto());
		System.out.println(cuc1.calcolaTasse());
		System.out.println(cuc2.calcolaTasse());
		listaContratti.affitta(cuc10, "Silvio Berlusconi");
		System.out.println(cuc10.toString()+" --- Questo contratto è locato?"+cuc10.isLocato());
		listaContratti.libera(cuc10);
		System.out.println(cuc10.toString()+" --- Questo contratto è locato?"+cuc10.isLocato());
		System.out.println();
		listaContratti.dammiNumeroVani(5);
		System.out.println();
		listaContratti.dammiNumeroMetriQuadrati(100, 150);
		 @SuppressWarnings("unused")
		 GraficaContratti g = new GraficaContratti(listaContratti);
	}

}
