package p26_08_2022;

public class Osoba {
	protected String imeIPrezime;
	protected String jmbg;
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public Osoba(String imeIPrezime, String jmbg) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}
	
	public void stampaj() {
		System.out.println(imeIPrezime + ", " + jmbg);
	}

}
