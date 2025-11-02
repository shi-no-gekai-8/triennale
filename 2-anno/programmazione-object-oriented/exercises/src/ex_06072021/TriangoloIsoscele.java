package ex_06072021;

public class TriangoloIsoscele extends FigureGeometriche {
	public TriangoloIsoscele(double base, double altezza, double lato) {
		this.base=base;
		this.altezza=altezza;
		this.lato=lato;
	}
	public double getPerimetro() {
		double p = base + (lato*2);
		return p;
	}
	public double getArea() {
		double a = (base*altezza)/2;
		return a;
	}
	private double base;
	private double altezza;
	private double lato;
}
