package p26_08_2022;

public class Student extends Osoba{
	private String brojIndexa;
	private int dugSkolarine;
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public int getDugSkolarine() {
		return dugSkolarine;
	}
	public void setDugSkolarine(int dugSkolarine) {
		this.dugSkolarine = dugSkolarine;
	}
	
	public Student(String imeIPrezime, String jmbg, String brojIndexa, int dugSkolarine) {
		super(imeIPrezime, jmbg);
		this.brojIndexa = brojIndexa;
		this.dugSkolarine = dugSkolarine;
	}
	public void uplatiSkolarinu(int uplata) {
		this.dugSkolarine = this.dugSkolarine - uplata;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj indeksa: " + this.brojIndexa);
		System.out.println("Dug za skolarinu: " + this.dugSkolarine);
	}

}
