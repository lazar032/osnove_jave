package d26_08_2022;

public class Osoba {
	protected String imeIPrezime;
	protected String jmbg;
	protected int godRodjenja;
	
	public Osoba() {
		
	}

	public Osoba(String imeIPrezime, String jmbg, int godRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public void stampaj() {
		System.out.println(imeIPrezime + ", " + jmbg + ", " + godRodjenja);
	}
	

}
