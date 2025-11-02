package ex_14072021;

import java.util.ArrayList;

public class IstitutoBancario {
	public IstitutoBancario() {
		this.listaCarteCredito = new ArrayList<CartaDiCredito>();
	}
	public ArrayList<CartaDiCredito> getListaCarteCredito() {
		return listaCarteCredito;
	}
	public void setListaCarteCredito(ArrayList<CartaDiCredito> listaCarteCredito) {
		this.listaCarteCredito = listaCarteCredito;
	}
	public void aggiungiCartaDiCredito(CartaDiCredito c) {
		try {
			for(int i=0;i<listaCarteCredito.size();i++) {
				if(c.getNumero().equalsIgnoreCase(listaCarteCredito.get(i).getNumero())) {
					throw new BadCardIDException();
				}
			}
			listaCarteCredito.add(c);
		} catch(BadCardIDException e) {
			System.out.println(e.toString());
		}
	}
	public void deposita(String numeroCarta, double importo) {
		try {
			if(importo<=0) {
				throw new BadParameterException();
			}
			for(int i=0;i<listaCarteCredito.size();i++) {
				if(!(numeroCarta.equalsIgnoreCase(listaCarteCredito.get(i).getNumero()))) {
					throw new BadCardIDException();
				} else {
					listaCarteCredito.get(i).getContoBancario().deposit(importo);
				}
			}
			
		} catch(BadParameterException e) {
			System.out.println(e.toString());
		} catch(BadCardIDException e) {
			System.out.println(e.toString());
		}
	}
	public void preleva(String numeroCarta, double importo) {
		try {
			if(importo<=0) {
				throw new BadParameterException();
			}
			for(int i=0;i<listaCarteCredito.size();i++) {
				if(!(numeroCarta.equalsIgnoreCase(listaCarteCredito.get(i).getNumero()))) {
					throw new BadCardIDException();
				} else {
					listaCarteCredito.get(i).getContoBancario().withdraw(importo);;
				}
			}
			
		} catch(BadParameterException e) {
			System.out.println(e.toString());
		} catch(BadCardIDException e) {
			System.out.println(e.toString());
		}
	}
	public int getSize() {
		return listaCarteCredito.size();
	}
	private ArrayList<CartaDiCredito> listaCarteCredito;
}