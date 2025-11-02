package ex_07072021;

import java.util.ArrayList;

public class Ambata extends GiocoAzzardo {
	public Ambata(double c) {
		super(c);
		ambata = getGenerator().nextInt(45)+1;
		ruota = new int [10];
		for(int i=0;i<10;i++) {
			int generato = getGenerator().nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(generato==ruota[j]) {
					generato = 0;
					if(generato==0) {
						i--;
					} else {
						ruota[i]=generato;
					}
				}
			}
		}
	}
	public boolean gioca() {
		for(int i=0;i<10;i++) {
			if(ruota[i]==ambata) {
				return true;
			}
		}
		return false;
	}
	private int ambata;
	private int[] ruota;
	@Override
	protected double dammiVincita() {
		// TODO Auto-generated method stub
		return 0;
	}
}
