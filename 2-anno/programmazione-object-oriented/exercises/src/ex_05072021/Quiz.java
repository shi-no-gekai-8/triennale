package ex_05072021;

public class Quiz implements Measurable {
	public Quiz(int punteggio, String votoLettere) {
		this.punteggio = punteggio;
		this.votoLettere = votoLettere;
	}
	@Override
	public double getMeasure() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	public String getVotoLettere() {
		return votoLettere;
	}
	public void setVotoLettere(String votoLettere) {
		this.votoLettere = votoLettere;
	}
	
	private double punteggio;
	private String votoLettere;
}
