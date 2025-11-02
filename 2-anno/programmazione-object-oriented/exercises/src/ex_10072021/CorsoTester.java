package ex_10072021;

import java.util.Random;

public class CorsoTester {
	public static void main(String[] args) {
		Random generator = new Random();
		ProgrammazioneDidattica listaCorsi = new ProgrammazioneDidattica("Informatica", 10, 5000);
		CorsoTriennale ct1 = new CorsoTriennale("Programmazione 1", "Maurizio Tucci", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct2 = new CorsoTriennale("Architettura degli Elaboratori", "Barbara Masucci", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct3 = new CorsoTriennale("Matematica Discreta", "Giacomo Lenzi", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct4 = new CorsoTriennale("Metodi Matematici per l'Informatica", "Rocco Zaccagnino", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct5 = new CorsoTriennale("Analisi 1", "Gerardo Iovane", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct6 = new CorsoTriennale("Programmazione & Strutture Dati", "Maurizio Tucci", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct7 = new CorsoTriennale("Inglese", "Colin Firth", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct8 = new CorsoTriennale("Sistemi Operativi", "Bruno Carpentieri", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct9 = new CorsoTriennale("Programmazione Object Oriented", "Carmine Gravino", generator.nextInt(20)+1, generator.nextInt(10)+1);
		CorsoTriennale ct10 = new CorsoTriennale("Calcolo Probabilità & Statistica Matematica", "Virginia Giorno", generator.nextInt(20)+1, generator.nextInt(10)+1);
		listaCorsi.aggiungiCorso(ct1);
		listaCorsi.aggiungiCorso(ct2);
		listaCorsi.aggiungiCorso(ct3);
		listaCorsi.aggiungiCorso(ct4);
		listaCorsi.aggiungiCorso(ct5);
		listaCorsi.aggiungiCorso(ct6);
		listaCorsi.aggiungiCorso(ct7);
		listaCorsi.aggiungiCorso(ct8);
		listaCorsi.aggiungiCorso(ct9);
		listaCorsi.aggiungiCorso(ct10);
		CorsoMagistrale cm1 = new CorsoMagistrale("Affidabilità di Sistemi", "Virginia Giorno", generator.nextInt(20)+1);
		CorsoMagistrale cm2 = new CorsoMagistrale("Algoritmi Avanzati", "Roberto De Prisco", generator.nextInt(20)+1);
		CorsoMagistrale cm3 = new CorsoMagistrale("Architettura Distribuite per il Cloud", "Alberto Negro", generator.nextInt(20)+1);
		CorsoMagistrale cm4 = new CorsoMagistrale("Automi e Linguaggi Formali", "Clelia De Felice", generator.nextInt(20)+1);
		CorsoMagistrale cm5 = new CorsoMagistrale("Basi di Dati II", "Genoveffa Tortora", generator.nextInt(20)+1);
		listaCorsi.aggiungiCorso(cm1);
		listaCorsi.aggiungiCorso(cm2);
		listaCorsi.aggiungiCorso(cm3);
		listaCorsi.aggiungiCorso(cm4);
		listaCorsi.aggiungiCorso(cm5);
		CorsoDottorato cd1 = new CorsoDottorato("Deep Learning in Biometrics", "Donida Labati Ruggiero", "Inglese", generator.nextInt(20)+1);
		CorsoDottorato cd2 = new CorsoDottorato("Deep Learning for Signal and Image Processing", "Genovese Angelo", "Inglese", generator.nextInt(20)+1);
		CorsoDottorato cd3 = new CorsoDottorato("Philosophie in Der Informatik", "Georg Hegel", "Tedesco", generator.nextInt(20)+1);
		CorsoDottorato cd4 = new CorsoDottorato("Visual Computing e Computer Games", "Pavel Nedved", "Ceco", generator.nextInt(20)+1);
		CorsoDottorato cd5 = new CorsoDottorato("Seguridad Informatica", "Miguel de Cervantes", "Spagnolo", generator.nextInt(20)+1);
		listaCorsi.aggiungiCorso(cd1);
		listaCorsi.aggiungiCorso(cd2);
		listaCorsi.aggiungiCorso(cd3);
		listaCorsi.aggiungiCorso(cd4);
		listaCorsi.aggiungiCorso(cd5);
		Grafica grafica = new Grafica(listaCorsi);
	}
}
