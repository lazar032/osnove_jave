package p22_08_2022;

public class Proizvod {
	private String naziv;
	private Kupac kupac;
	private double cena;
	
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public Proizvod(String naziv, int cena) {
		this.naziv = naziv;
		this.cena = cena;
	}
	public double finalnaCena() {
		return this.cena = this.cena * 1.9 * (100 -  
				this.kupac.getClanskaKarta().getPopust()) / 100;
	}
	public void stampaj() {
		System.out.println(this.naziv + " - " + this.finalnaCena());
		System.out.println(this.kupac.getImeIPrezime() + " - " +
		this.kupac.getClanskaKarta().getBrojKartice());
	}
	

}
