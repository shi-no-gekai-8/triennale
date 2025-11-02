package ex_13072021;

import java.util.GregorianCalendar;

public class TesserinoStudente extends Tesserino {
	
	public TesserinoStudente(int codice, String nome, String cognome, String matricola, GregorianCalendar dataScadenza, double saldo, String fascia, boolean bonus) {
		super(codice, nome, cognome);
		this.matricola = matricola;
		this.dataScadenza = dataScadenza;
		this.saldo = saldo;
		this.fascia = fascia;
		this.bonus = bonus;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public GregorianCalendar getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(GregorianCalendar dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getFascia() {
		return fascia;
	}
	public void setFascia(String fascia) {
		this.fascia = fascia;
	}
	public boolean isBonus() {
		return bonus;
	}
	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	public double calcolaPrezzo() {
		if(fascia.equalsIgnoreCase("A") && bonus) {
			return 2.5-1;
		} else if(fascia.equalsIgnoreCase("A") && !bonus) {
			return 2.5;
		} else if(fascia.equalsIgnoreCase("B") && bonus) {
			return 1.5-1;
		}
		return 1.5;
	}
	public double paga() {
		try {
			if(dataScadenza.before(System.currentTimeMillis())) {
				throw new TesserinoScadutoException();
			}
			return saldo-calcolaPrezzo();
		} catch(TesserinoScadutoException e) {
			System.out.println(e.toString());
		}
		try {
			if(saldo<calcolaPrezzo()) {
				throw new SaldoInsufficienteException();
			}
			
		} catch(SaldoInsufficienteException e) {
			System.out.println(e.toString());
		}
		return saldo-calcolaPrezzo();
	}
	private String matricola;
	private GregorianCalendar dataScadenza;
	private double saldo;
	private String fascia;
	private boolean bonus;
}
