package ex_13072021;

import java.util.GregorianCalendar;

public class Iride extends Biometria {
	
	public Iride(GregorianCalendar dataCreazione, String strumentoMisurazione, String occhio, String irisCode) {
		super(dataCreazione, strumentoMisurazione);
		this.occhio = occhio;
		this.irisCode = irisCode;
		try {
			if(irisCode.length()<6) {
				throw new WrongIrisCodeException();
			}
		} catch(WrongIrisCodeException e) {
			System.out.println(e.toString());
		}
	}
	public String getOcchio() {
		return occhio;
	}
	public void setOcchio(String occhio) {
		this.occhio = occhio;
	}
	public String getIrisCode() {
		return irisCode;
	}
	public void setIrisCode(String irisCode) {
		this.irisCode = irisCode;
	}
	public boolean verifica(Iride b) {
		if(b.getOcchio().equalsIgnoreCase(occhio) && b.getIrisCode().equalsIgnoreCase(irisCode)) {
			return true;
		}
		return false;
	}
	public double similarita(Iride b) {
		int totaleCaratteri = 0;
		char carattereComune = 0;
		for(int i=0;i<b.irisCode.length();i++) {
			if(carattereComune == b.irisCode.charAt(i)) {
				totaleCaratteri++;
			}
		}
		return totaleCaratteri;
	}
	private String occhio;
	private String irisCode;
}
