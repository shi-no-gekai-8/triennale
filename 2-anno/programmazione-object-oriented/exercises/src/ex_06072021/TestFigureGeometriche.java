package ex_06072021;

import java.util.ArrayList;
import java.util.Random;

public class TestFigureGeometriche {

	public static void main(String[] args) {
		Random generatoreDimensioni = new Random();
		ArrayList<FigureGeometriche> listaFigure = new ArrayList<FigureGeometriche>();
		FigureGeometriche c1 = new Cerchio(generatoreDimensioni.nextInt(100), 3.14159);
		FigureGeometriche c2 = new Cerchio(generatoreDimensioni.nextInt(100), 3.14159);
		FigureGeometriche c3 = new Cerchio(generatoreDimensioni.nextInt(100), 3.14159);
		FigureGeometriche c4 = new Cerchio(generatoreDimensioni.nextInt(100), 3.14159);
		FigureGeometriche c5 = new Cerchio(generatoreDimensioni.nextInt(100), 3.14159);
		FigureGeometriche r1 = new Rettangolo(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche r2 = new Rettangolo(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche r3 = new Rettangolo(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche r4 = new Rettangolo(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche r5 = new Rettangolo(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche t1 = new TriangoloIsoscele(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche t2 = new TriangoloIsoscele(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche t3 = new TriangoloIsoscele(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche t4 = new TriangoloIsoscele(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		FigureGeometriche t5 = new TriangoloIsoscele(generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100), generatoreDimensioni.nextInt(100));
		listaFigure.add(c1);
		listaFigure.add(c2);
		listaFigure.add(c3);
		listaFigure.add(c4);
		listaFigure.add(c5);
		listaFigure.add(r1);
		listaFigure.add(r2);
		listaFigure.add(r3);
		listaFigure.add(r4);
		listaFigure.add(r5);
		listaFigure.add(t1);
		listaFigure.add(t2);
		listaFigure.add(t3);
		listaFigure.add(t4);
		listaFigure.add(t5);
		double sommaAree = 0;
		double sommaPerimetri = 0;
		for(FigureGeometriche figura : listaFigure) {
			sommaAree += figura.getArea();
			sommaPerimetri += figura.getPerimetro();
		}
		System.out.println("La somma totale delle aree è: "+sommaAree+", mentre quella dei perimetri: "+sommaPerimetri);
	}

}
