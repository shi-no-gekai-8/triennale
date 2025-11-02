package ex_01072021;

public class Year {
	
	public Year(String anno, boolean isBisestile) {
		this.anno = anno;
		this.isBisestile = isBisestile;
	}
	
	public String getAnno() {
		return anno;
	}
	public boolean isBisestile() {
		return isBisestile;
	}

	public String anno;
	public boolean isBisestile;
}
