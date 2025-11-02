package ex_06072021;

public class Cerchio extends FigureGeometriche {
	public Cerchio(double raggio, double piGreco) {
		this.raggio=raggio;
		this.piGreco=piGreco;
	}
	public double getPerimetro() {
		double c = (2*piGreco)*raggio;
		return c;
	}
	public double getArea() {
		double a = piGreco * (raggio*raggio);
		return a;
	}
	private double raggio;
	private double piGreco;
}
