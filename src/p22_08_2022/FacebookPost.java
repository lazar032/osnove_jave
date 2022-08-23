package p22_08_2022;

public class FacebookPost {
	private String opis;
	private Korisnik korisnik;
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public FacebookPost(String opis) {
		this.opis = opis;
	}
	public void print() {
		System.out.println(this.korisnik.getIme() + " " + this.korisnik.getPrezime());
		System.out.println(this.opis);
	}
	

}
