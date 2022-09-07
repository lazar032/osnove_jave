package p05_09_2022;

public abstract class PlatnaKartica {
	protected double suma;
	protected String broj;
	protected int godina;
	protected int mesec;
	public double getSuma() {
		return suma;
	}
	public String getBroj() {
		return broj;
	}
	public int getGodina() {
		return godina;
	}
	public int getMesec() {
		return mesec;
	}
	public PlatnaKartica(double suma, String broj, int godina, int mesec) {
		super();
		this.suma = suma;
		this.broj = broj;
		this.godina = godina;
		this.mesec = mesec;
	}
	
	public void dodajSredstva(double dodaj) {
		this.suma += dodaj;
	}
	
	public abstract void izvrsiTransakciju(double skini);
	
	public abstract void stampaj();

}
