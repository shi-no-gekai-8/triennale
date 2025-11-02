package ex_03072021;

public class Serratura {
	public Serratura() {
		aperta = false;
	}
	
	public void setLettera(String lettera) {
		this.lettera = lettera;
	}
	public void unlock(String codice) {
		if(codice.equalsIgnoreCase(lettera)) {
			aperta = true;
		} else {
			System.err.println("Il codice è sbagliato.");
		}
	}
	public boolean isOpen() {
		if(aperta) {
			System.out.println("La serratura è chiusa.");
			return false;
		} 
		return true;
	}
	public void lock() {
		aperta = false;
		System.out.println("Serratura chiusa");
	}
	public void newComb(String nuovaCombinazione) {
		nuova = null;
		if(!aperta) {
			nuova.setLettera(nuovaCombinazione);
		} else {
			System.out.println("La serratura è chiusa.");
		}
	}
	
	public String getLettera() {
		return lettera;
	}

	private boolean aperta;
	private String lettera;
	private Serratura nuova;
}
