package p05_09_2022;

public abstract class Student {
	protected String imeIPrezime;
	protected String brojIndexa;
	protected int godStudija;
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	public Student(String imeIPrezime, String brojIndexa, int godStudija) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.brojIndexa = brojIndexa;
		this.godStudija = godStudija;
	}
	
	public abstract int skolarina();
	
	public abstract String budzet();
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.brojIndexa + ", " + this.godStudija);
		System.out.println("Finansiranje: " + this.budzet());
		System.out.println("Cena: " + this.skolarina());
	}

}
