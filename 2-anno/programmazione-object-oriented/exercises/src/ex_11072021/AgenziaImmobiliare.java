package ex_11072021;

import java.util.ArrayList;
public class AgenziaImmobiliare {
	public AgenziaImmobiliare(String nome, int numeroMassimoImmobili) {
		this.nome = nome;
		this.numeroMassimoImmobili = numeroMassimoImmobili;
		listaContratti = new ArrayList<Contratto>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Contratto> getListaContratti() {
		return listaContratti;
	}
	public void setListaContratti(ArrayList<Contratto> listaContratti) {
		this.listaContratti = listaContratti;
	}
	public int getNumeroMassimoImmobili() {
		return numeroMassimoImmobili;
	}
	public void setNumeroMassimoImmobili(int numeroMassimoImmobili) {
		this.numeroMassimoImmobili = numeroMassimoImmobili;
	}
	public void aggiungiImmobile(Contratto c) {
		try {
			if(listaContratti.size()>=numeroMassimoImmobili) {
				throw new NumMaxException();
			}
			listaContratti.add(c);
		} catch(NumMaxException e) {
			System.out.println(e.toString());
		}
	}
	public void affitta(Contratto c, String nomeConduttore) {
		try {
			if(c.isLocato()) {
				throw new GiaLocatoException();
			}
			c.setNomeConduttore(nomeConduttore);
			c.setLocato(true);
		} catch(GiaLocatoException e) {
			System.out.println(e.toString());
		}
	
	}
	public void libera(Contratto c) {
		if((c.isLocato())) {
			c.setLocato(false);
			c.setNomeConduttore(" ");
		}
	}
	public void dammiNumeroVani(int x) {
		ArrayList<Contratto> matchingList = new ArrayList<Contratto>();
		for(Contratto c : listaContratti) {
			if(c instanceof ContrattoUsoAbitativo) {
				if(((ContrattoUsoAbitativo) c).getNumeroVani()<x) {
					matchingList.add(c);
				}
			}
		}
		for(Contratto c : matchingList) {
			System.out.println(c.toString());
		}
	}
	public void dammiNumeroMetriQuadrati(int x, int y) {
		ArrayList<Contratto> matchingList = new ArrayList<Contratto>();
		for(Contratto c : listaContratti) {
			if(c instanceof ContrattoUsoCommerciale) {
				if(((ContrattoUsoCommerciale) c).getNumeroMetriQuadri()>=x && ((ContrattoUsoCommerciale) c).getNumeroMetriQuadri()<=y) {
					matchingList.add(c);
				}
			}
		}
		for(Contratto c : matchingList) {
			System.out.println(c.toString());
		}
	}
	public void printAllElements() {
		for(Contratto c : listaContratti) {
			System.out.println(c.toString());
		}
	}
	private String nome;
	private ArrayList<Contratto> listaContratti;
	private int numeroMassimoImmobili;
}
