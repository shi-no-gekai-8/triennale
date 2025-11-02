package ex_13072021;

import java.util.Random;

public class MostroTester {
	public static void main(String[] args) {
	Combattimento c = new Combattimento();
	Random generator = new Random();
	MostroDiFuoco mf1 = new MostroDiFuoco("Voldemort", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf2 = new MostroDiFuoco("Sauron", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf3 = new MostroDiFuoco("Smaug", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf4 = new MostroDiFuoco("Bellatrix Lestrange", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf5 = new MostroDiFuoco("Aro", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf6 = new MostroDiFuoco("Re della Notte", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiFuoco mf7 = new MostroDiFuoco("Cersei Lannister", generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 20);
	MostroDiAcqua ma1 = new MostroDiAcqua("Thanos",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma2 = new MostroDiAcqua("Iron Monger",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma3 = new MostroDiAcqua("Abominio",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma4 = new MostroDiAcqua("Teschio Rosso",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma5 = new MostroDiAcqua("Loki",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma6 = new MostroDiAcqua("Kingpin",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiAcqua ma7 = new MostroDiAcqua("Venom",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 25);
	MostroDiPietra mp1 = new MostroDiPietra("Darth Vader",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	MostroDiPietra mp2 = new MostroDiPietra("Terminator",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	MostroDiPietra mp3 = new MostroDiPietra("Ivan Drago",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	MostroDiPietra mp4 = new MostroDiPietra("Aleksej Tarasov",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	MostroDiPietra mp5 = new MostroDiPietra("Daiki Saitou",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	MostroDiPietra mp6 = new MostroDiPietra("Nolan Emory",generator.nextInt(50-40)+40, generator.nextInt(40-10)+10, 30);
	c.aggiungiMostro(mf1);
	c.aggiungiMostro(mf2);
	c.aggiungiMostro(mf3);
	c.aggiungiMostro(mf4);
	c.aggiungiMostro(mf5);
	c.aggiungiMostro(mf6);
	c.aggiungiMostro(mf7);
	c.aggiungiMostro(ma1);
	c.aggiungiMostro(ma2);
	c.aggiungiMostro(ma3);
	c.aggiungiMostro(ma4);
	c.aggiungiMostro(ma5);
	c.aggiungiMostro(ma6);
	c.aggiungiMostro(ma7);
	c.aggiungiMostro(mp1);
	c.aggiungiMostro(mp2);
	c.aggiungiMostro(mp3);
	c.aggiungiMostro(mp4);
	c.aggiungiMostro(mp5);
	c.aggiungiMostro(mp6);
	for(int i=0;i<300;i++) {
		c.combatti(generator.nextInt(c.getSize()), generator.nextInt(c.getSize()));
		c.rimuovi();
		System.out.println((i+1)+" ROUND");
	}
	System.out.println("Sopravvissuti: n°"+c.getSize());
	System.out.println(c.toString()+"\n");
	}
}
