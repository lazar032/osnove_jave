package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String imeIPrezime;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	public abstract double plataRadnika();
	
	public void zaposliUSektor(Sektor sektor) {
		sektori.add(sektor);
	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	
	public abstract void stampaj();
	
}
