package ex_09072021;

import java.util.Random;

public class TestClient {
	public static void main(String[] args) {
		Random generator = new Random();
		int saldo = generator.nextInt(1000-500)+500;
		Cliente c = new Cliente("GVBNYW40H24I536P", saldo);
		System.out.println(c.toString());
		SpedizioneInternazionale s1 = new SpedizioneInternazionale("Londra", "Roma");
		SpedizioneInternazionale s2 = new SpedizioneInternazionale("Amsterdam", "Mosca");
		SpedizioneInternazionale s3 = new SpedizioneInternazionale("Lisbona", "Madrid");
		SpedizioneInternazionale s4 = new SpedizioneInternazionale("Lisbona", "Roma");
		SpedizioneInternazionale s5 = new SpedizioneInternazionale("Parigi", "Berlino");
		SpedizioneNazionale n1 = new SpedizioneNazionale("Roma", "Aosta");
		SpedizioneNazionale n2 = new SpedizioneNazionale("Salerno", "Napoli");
		SpedizioneNazionale n3 = new SpedizioneNazionale("Milano", "Napoli");
		SpedizioneNazionale n4 = new SpedizioneNazionale("Firenze", "Bologna");
		SpedizioneNazionale n5 = new SpedizioneNazionale("Roma", "Salerno");
		c.spedisci(s1);
		c.spedisci(s2);
		c.spedisci(s3);
		c.spedisci(s4);
		c.spedisci(s5);
		System.out.println(c.toString());
		c.spedisci(n1);
		c.spedisci(n2);
		c.spedisci(n3);
		c.spedisci(n4);
		c.spedisci(n5);
		System.out.println(c.toString());
		}
	}
