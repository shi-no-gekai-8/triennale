package ex_06072021;

public class Rettangolo extends FigureGeometriche {
	public Rettangolo(double base, double altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	public double getPerimetro() {
		double p = (2*base)+(2*altezza);
		return p;
	}
	public double getArea() {
		double a = base*altezza;
		return a;
	}
	private double base;
	private double altezza;
}
