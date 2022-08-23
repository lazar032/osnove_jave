package p22_08_2022;

public class Kupac {
	private String imeIPrezime;
	private ClanskaKarta clanskaKarta;
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public ClanskaKarta getClanskaKarta() {
		return clanskaKarta;
	}
	public void setClanskaKarta(ClanskaKarta clanskaKarta) {
		this.clanskaKarta = clanskaKarta;
	}
	public Kupac(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void stampaj() {
		System.out.println(this.imeIPrezime + " - " + this.clanskaKarta.getBrojKartice());
	}

}
