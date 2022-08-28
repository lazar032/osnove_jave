package p26_08_2022;

public class PlatnaKartica {
	protected double suma;
	protected String broj;
	protected int godina;
	protected int mesec;
	
	public PlatnaKartica(double suma, String broj, int godina, int mesec) {
		super();
		this.suma = suma;
		this.broj = broj;
		this.godina = godina;
		this.mesec = mesec;
	}

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
	
	public void dodajSredstva(double dodaj) {
		this.suma = this.suma + dodaj;
	}
	
	public void izvrsiTransakciju(double skini) {
		this.suma = this.suma - skini;
	}
	
	public void stampaj() {
		System.out.println(broj + ", " + mesec + "/" + godina + ", $" + suma);
	}

}
