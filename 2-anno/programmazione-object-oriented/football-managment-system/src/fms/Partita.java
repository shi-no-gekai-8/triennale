package fms;

import java.util.Date;

public class Partita {
	public Squadre getSquadraCasa() {
		return squadraCasa;
	}
	public void setSquadraCasa(Squadre squadraCasa) {
		this.squadraCasa = squadraCasa;
	}
	public Squadre getSquadraTrasferta() {
		return squadraTrasferta;
	}
	public void setSquadraTrasferta(Squadre squadraTrasferta) {
		this.squadraTrasferta = squadraTrasferta;
	}
	public int getGoalCasa() {
		return goalCasa;
	}
	public void setGoalCasa(int goalCasa) {
		this.goalCasa = goalCasa;
	}
	public int getGoalTrasferta() {
		return goalTrasferta;
	}
	public void setGoalTrasferta(int goalTrasferta) {
		this.goalTrasferta = goalTrasferta;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	private Squadre squadraCasa;
	private Squadre squadraTrasferta;
	private int goalCasa;
	private int goalTrasferta;
	private Date date;
}
