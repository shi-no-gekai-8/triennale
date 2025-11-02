package fms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class SerieA implements CampionatoManager {
	public SerieA(int numeroSquadre) {
		this.numeroSquadre = numeroSquadre;
		listaSquadre = new ArrayList<Squadre>();
		input = new Scanner(System.in);
		listaPartite = new ArrayList<Partita>();
		mostraMenu();
	}
	public int getNumeroSquadre() {
		return numeroSquadre;
	}
	public ArrayList<Squadre> getListaSquadre() {
		return listaSquadre;
	}
	public Scanner getInput() {
		return input;
	}
	public ArrayList<Partita> getListaPartite() {
		return listaPartite;
	}
	private void mostraMenu() {
		while(true) {
			System.out.println("Menu di Serie A: ");
			System.out.println("Per aggiungere una squadra premere 1");
			System.out.println("Per cancellare una squadra premere 2");
			System.out.println("Per vedere le statistiche per squadre premere 3");
			System.out.println("Per vedere la classifica premere 4");
			System.out.println("Per aggiungere una partita premere 5");
			String lettura = input.nextLine();
			int comando = 0;
			try {
				comando = Integer.parseInt(lettura);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			switch(comando) {
			case 1: aggiungiSquadra(); break;
			case 2: cancellaSquadra(); break;
			case 3: mostraStatistiche(); break;
			case 4: mostraClassifica(); break;
			case 5: aggiungiPartita(); break;
			}
		}
	}
	private void aggiungiSquadra() {
		try {
			if(listaSquadre.size()==numeroSquadre) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("Non si possono aggiungere altri club: "+e.toString());
		}
		Squadre squadra = new Squadre();
		System.out.println("Inserisci il nome: ");
		String lettura = input.nextLine();
		squadra.setNome(lettura);
		if(listaSquadre.contains(squadra)) {
			System.out.println("La squadra è già presente.");
			return;
		}
		System.out.println("Inserisci lo stadio	: ");
		lettura = input.nextLine();
		squadra.setStadio(lettura);
		listaSquadre.add(squadra);
	}
	private void cancellaSquadra() {
		System.out.println("Inserisci nome squadra: ");
		String lettura = input.nextLine();
		for(Squadre s : listaSquadre) {
			if(s.getNome().equals(lettura)) {
				listaSquadre.remove(s);
				System.out.println("Squadra: "+s.getNome()+" - ELIMINATA");
				return;
			}
		}
		System.out.println("Non è possibile cancellare la squadra perché non è presente.");
	}
	private void mostraStatistiche() {
		System.out.println("Inserisci nome squadra: ");
		String lettura = input.nextLine();
		for(Squadre s : listaSquadre) {
			if(s.getNome().equals(lettura)) {
				System.out.println("SQUADRA: "+s.getNome());
				System.out.println("Punti: "+s.getPunti());
				System.out.println("Partite Giocate: "+s.getGiocate());
				System.out.println("Vittorie: "+s.getNumeroVittorie());
				System.out.println("Pareggi: "+s.getNumeroPareggi());
				System.out.println("Sconfitte: "+s.getNumeroSconfitte());
				System.out.println("Goal Fatti: "+s.getGoalFatti());
				System.out.println("Goal Subiti: "+s.getGoalSubiti());
				System.out.println("Differenza Reti: "+(s.getGoalFatti()-s.getGoalSubiti()));
			}
		}
		System.out.println("Non è possibile cancellare la squadra perché non è presente.");
	}
	private void mostraClassifica() {
		Collections.sort(listaSquadre, new SquadreComparator());
		for(Squadre s : listaSquadre) {
			System.out.println("Squadra: "+s.getNome()+", Punti: "+s.getPunti()+", Differenza Reti: "+(s.getGoalFatti()-s.getGoalSubiti()));
		}
	}
	private void aggiungiPartita() {
		System.out.println("Inserisci una data (MM-DD-YYYY): ");
		String lettura = input.nextLine();
		Date date = null;
		try {
			date = new SimpleDateFormat("MM-dd-yyyy").parse(lettura);
 		} catch(ParseException e) {
 			System.out.println(e.toString());
 		}
		System.out.println("Inserisci squadra di casa: ");
		lettura = input.nextLine();
		Squadre casa = null;
		for(Squadre s : listaSquadre) {
			if(s.getNome().equals(lettura)) {
				casa = s;
			}
		}
		if(casa==null) {
			System.out.println("La squadra non è presente.");
			return;
		}
		System.out.println("Inserisci squadra ospite: ");
		lettura = input.nextLine();
		Squadre ospite = null;
		for(Squadre s : listaSquadre) {
			if(s.getNome().equals(lettura)) {
				ospite = s;
			}
		}
		if(ospite==null) {
			System.out.println("La squadra non è presente.");
			return;
		}
		System.out.println("Inserisci goal casa: ");
		lettura = input.nextLine();
		int goalCasa = -1;
		try {
			goalCasa = Integer.parseInt(lettura);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(goalCasa==-1) {
			System.out.println("Devi inserire il numero di goal.");
			return;
		}
		System.out.println("Inserisci goal trasferta: ");
		lettura = input.nextLine();
		int goalTrasferta = -1;
		try {
			goalTrasferta = Integer.parseInt(lettura);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(goalTrasferta==-1) {
			System.out.println("Devi inserire il numero di goal.");
			return;
		}
		Partita partita = new Partita();
		partita.setDate(date);
		partita.setSquadraCasa(casa);
		partita.setSquadraTrasferta(ospite);
		partita.setGoalCasa(goalCasa);
		partita.setGoalTrasferta(goalTrasferta);
		listaPartite.add(partita);
		casa.setGoalFatti(casa.getGoalFatti()+goalCasa);
		ospite.setGoalFatti(ospite.getGoalFatti()+goalTrasferta);
		casa.setGoalSubiti(casa.getGoalSubiti()+goalTrasferta);
		ospite.setGoalSubiti(ospite.getGoalSubiti()+goalCasa);
		casa.setGiocate(casa.getGiocate()+1);
		ospite.setGiocate(ospite.getGiocate()+1);
		if(goalCasa > goalTrasferta) {
			casa.setPunti(casa.getPunti()+3);
			casa.setNumeroVittorie(casa.getNumeroVittorie()+1);
			ospite.setNumeroSconfitte(ospite.getNumeroSconfitte()+1);
		} else if(goalCasa < goalTrasferta) {
			ospite.setPunti(ospite.getPunti()+3);
			ospite.setNumeroVittorie(ospite.getNumeroVittorie()+1);
			casa.setNumeroSconfitte(casa.getNumeroSconfitte()+1);
		} else {
			casa.setPunti(casa.getPunti()+1);
			ospite.setPunti(ospite.getPunti()+1);
			casa.setNumeroPareggi(casa.getNumeroPareggi()+1);
			ospite.setNumeroPareggi(ospite.getNumeroPareggi()+1);
		}
		
	}
	private final int numeroSquadre;
	private final ArrayList<Squadre> listaSquadre;
	private final Scanner input;
	private final ArrayList<Partita> listaPartite;
}
