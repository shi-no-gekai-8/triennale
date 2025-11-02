package ex_15072021;

public class Noleggio {
	public Noleggio(Film film, int codiceCliente) {
		try {
			if(codiceCliente<0) {
				throw new BadIDException();
			}
			this.film = film;
			this.codiceCliente = codiceCliente;
		} catch(BadIDException e) {
			System.out.println(e.toString());
		}
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public int getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	public int getGiorniDiRitardo() {
		return film.getGiorniRitardo();
	}
	public double calcolaPenale() {
		return film.calcolaPenaleRitardo(film.getGiorniRitardo());
	}
	public String toString() {
		return "Noleggiato: "+film.getTitolo()+", Cliente: "+codiceCliente+", Film: "+film.getCodice();
	}
	private Film film;
	private int codiceCliente;
}
