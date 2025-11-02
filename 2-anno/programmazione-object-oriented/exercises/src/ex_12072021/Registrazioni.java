package ex_12072021;

import java.text.ParseException;
import java.util.ArrayList;

public class Registrazioni {
	
	public Registrazioni() {
		listaRegistrazioni = new ArrayList<Registrazione>();
	}
	public void aggiungiRegistrazione(Registrazione r) {
		try {
			for(Registrazione re : listaRegistrazioni) {
				if(r.getNome().equalsIgnoreCase(re.getNome()) && r.getCognome().equalsIgnoreCase(re.getCognome())) {
					throw new RegistrationException();
				}
			}
		} catch(RegistrationException e) {
			System.out.println(e.toString());
		}
		listaRegistrazioni.add(r);
	}
	public double dammiTotale() throws ParseException {
		double incassoTotale = 0;
		for(int i=0;i<listaRegistrazioni.size();i++) {
			incassoTotale += listaRegistrazioni.get(i).calcolaCosto();
		}
		return incassoTotale;
	}
	public ArrayList<Registrazione> dammiRegistrazionePerTipoPartecipante(int x){
		try {
			if(x!=0 && x!=1) {
				throw new InvalidParameterException();
			}
			else if(x==0) {
				ArrayList<Registrazione> listaStudenti = new ArrayList<Registrazione>();
				for(Registrazione re : listaRegistrazioni) {
					if(re.getTipo()==0) {
						listaStudenti.add(re);
					}
				}
				return listaStudenti;
			} else if(x==1) {
				ArrayList<Registrazione> listaProfessionisti = new ArrayList<Registrazione>();
				for(Registrazione re : listaRegistrazioni) {
					if(re.getTipo()==1) {
						listaProfessionisti.add(re);
					}
				}
				return listaProfessionisti;
			}
		} catch(InvalidParameterException e) {
			System.out.println(e.toString());
		}
		return listaRegistrazioni;
	}
	public double dammiTotalePerTipoRegistrazione(int x) throws ParseException {
		try {
			if(x!=0 && x!=1) {
				throw new InvalidParameterException();
			}
			else if(x==0) {
				ArrayList<Registrazione> listaStudenti = new ArrayList<Registrazione>();
				for(Registrazione re : listaRegistrazioni) {
					if(re.getTipo()==0) {
						listaStudenti.add(re);
					}
				}
				double totaleStudenti = 0;
				for(int i=0;i<listaStudenti.size();i++) {
					totaleStudenti += listaStudenti.get(i).calcolaCosto();
				}
				return totaleStudenti;
			} else if(x==1) {
				ArrayList<Registrazione> listaProfessionisti = new ArrayList<Registrazione>();
				for(Registrazione re : listaRegistrazioni) {
					if(re.getTipo()==1) {
						listaProfessionisti.add(re);
					}
				}
				double totaleProfessionisti = 0;
				for(int i=0;i<listaProfessionisti.size();i++) {
					totaleProfessionisti += listaProfessionisti.get(i).calcolaCosto();
				}
				return totaleProfessionisti;
			}
		} catch(InvalidParameterException e) {
			System.out.println(e.toString());
		}
		return x;
	}
	public ArrayList<Registrazione> getListaRegistrazioni() {
		return listaRegistrazioni;
	}
	public void setListaRegistrazioni(ArrayList<Registrazione> listaRegistrazioni) {
		this.listaRegistrazioni = listaRegistrazioni;
	}

	private ArrayList<Registrazione> listaRegistrazioni;
}
