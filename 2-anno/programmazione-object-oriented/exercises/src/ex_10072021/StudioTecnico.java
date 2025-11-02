package ex_10072021;

import java.util.ArrayList;
import java.util.Collections;

public class StudioTecnico {
	
	public StudioTecnico() {
		listaTecnici = new ArrayList<Tecnico>();
	}
	public void aggiungiProfessionista(Tecnico t) {
		listaTecnici.add(t);
	}
	public void effettuaIncontro(Tecnico t, Cliente c) {
		if(t.getNumeroIncontri()>=100) {
			System.out.println("Il professionista ha effettuato "+t.getNumeroIncontri()+" incontri e quindi, non può assistere.");
		}
	t.assisti(c);
	t.setNumeroIncontri(t.getNumeroIncontri()+1);
	}
	
	public ArrayList<Tecnico> getListaTecnici() {
		return listaTecnici;
	}
	public void setListaTecnici(ArrayList<Tecnico> listaTecnici) {
		this.listaTecnici = listaTecnici;
	}
	public void ordinaPerIncontri() {
		Collections.sort(listaTecnici, new TecniciPerIncontri());
	}
	public Tecnico tecnicoMaxIncontri() {
		return listaTecnici.get(listaTecnici.size()-1);
	}
	private ArrayList<Tecnico> listaTecnici;
}
