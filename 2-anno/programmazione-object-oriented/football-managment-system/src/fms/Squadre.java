package fms;

public class Squadre extends SuperClub {
	public int getNumeroVittorie() {
		return numeroVittorie;
	}
	public void setNumeroVittorie(int numeroVittorie) {
		this.numeroVittorie = numeroVittorie;
	}
	public int getNumeroPareggi() {
		return numeroPareggi;
	}
	public void setNumeroPareggi(int numeroPareggi) {
		this.numeroPareggi = numeroPareggi;
	}
	public int getNumeroSconfitte() {
		return numeroSconfitte;
	}
	public void setNumeroSconfitte(int numeroSconfitte) {
		this.numeroSconfitte = numeroSconfitte;
	}
	public int getGoalFatti() {
		return goalFatti;
	}
	public void setGoalFatti(int goalFatti) {
		this.goalFatti = goalFatti;
	}
	public int getGoalSubiti() {
		return goalSubiti;
	}
	public void setGoalSubiti(int goalSubiti) {
		this.goalSubiti = goalSubiti;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public int getGiocate() {
		return giocate;
	}
	public void setGiocate(int giocate) {
		this.giocate = giocate;
	}

	private int numeroVittorie;
	private int numeroPareggi;
	private int numeroSconfitte;
	private int goalFatti;
	private int goalSubiti;
	private int punti;
	private int giocate;
}
