package ex_13072021;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SlittaBabboNatale {
	public SlittaBabboNatale(ArrayList<Regalo> listaRegali, double pesoMax) {
		listaRegali = new ArrayList<Regalo>();
		this.pesoMax = pesoMax;
	}
	public ArrayList<Regalo> getListaRegali() {
		return listaRegali;
	}
	public void setListaRegali(ArrayList<Regalo> listaRegali) {
		this.listaRegali = listaRegali;
	}
	public double getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(double pesoMax) {
		this.pesoMax = pesoMax;
	}
	public void aggiungiRegalo(Regalo r) {
		try {
			if(r.getPeso()>pesoMax) {
				throw new PesoMaxSuperatoException();
			}
			listaRegali.add(r);
		} catch(PesoMaxSuperatoException e) {
			System.out.println(e.toString());
		}
	}
	public double calcolaCosto() {
		double costoTotale = 0;
		for(int i=0;i<listaRegali.size();i++) {
			costoTotale += listaRegali.get(i).calcolaCosto();
		}
		return costoTotale;
	}
	public void spedisci(Date data, Regalo r) {
		data = Calendar.getInstance().getTime();
	}
	private ArrayList<Regalo> listaRegali;
	private double pesoMax;
}
