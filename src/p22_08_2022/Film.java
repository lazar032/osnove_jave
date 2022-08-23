package p22_08_2022;

public class Film {
	private String film;
	private int godina;
	private Reziser reziser;
	public Film(String film, int godina) {
		this.film = film;
		this.godina = godina;
	}
	
	public void setFilm(String film) {
		this.film = film;
	}
	public void setGoidna(int godina) {
		this.godina = godina;
	}
	public String film( ) {
		return this.film;
	}
	public int godina() {
		return this.godina;
	}
	
	public void stampaj() {
		System.out.println(this.film + ", " + this.godina );
		System.out.println("Rezirao je: " + this.reziser.getImeIPrezime() + this.reziser.getStarost() + "god");
				
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public String getFilm() {
		return film;
	}

	public Reziser getReziser() {
		return reziser;
	}

	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}
	
	

}
