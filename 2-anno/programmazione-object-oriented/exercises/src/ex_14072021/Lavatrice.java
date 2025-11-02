package ex_14072021;

import java.util.ArrayList;
import java.util.Random;

public class Lavatrice extends Elettrodomestico {
	
	public Lavatrice(String nome, String marca, ArrayList<String> programmiLavaggio) {
		super(nome, marca);
		this.programmaSelezionato = "Nessun programma selezionato.";
		this.programmiLavaggio = new ArrayList<String>();
		programmiLavaggio.add("Lana");
		programmiLavaggio.add("Normale");
		programmiLavaggio.add("Seta");
		programmiLavaggio.add("Rapido");
	}
	public String getProgrammaSelezionato() {
		return programmaSelezionato;
	}
	public void setProgrammaSelezionato(String programmaSelezionato) {
		this.programmaSelezionato = programmaSelezionato;
	}
	public ArrayList<String> getProgrammiLavaggio() {
		return programmiLavaggio;
	}
	public void setProgrammiLavaggio(ArrayList<String> programmiLavaggio) {
		this.programmiLavaggio = programmiLavaggio;
	}
	public void start() {
		super.acceso = true;
		System.out.println("La lavatrice è accesa col programma selezionato: "+getProgrammaSelezionato());
	}
	public void next() {
		Random generator = new Random();
		setProgrammaSelezionato(programmiLavaggio.get(generator.nextInt(3)));
		if(getProgrammaSelezionato().equalsIgnoreCase(programmaSelezionato)) {
			setProgrammaSelezionato(programmiLavaggio.get(generator.nextInt(3)));
		}
	}
	private String programmaSelezionato;
	private ArrayList<String> programmiLavaggio;
}
