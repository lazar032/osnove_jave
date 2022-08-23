package p22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Korisnik korisnik = new Korisnik("Pera", "Peric");
		FacebookPost facebookPost = new FacebookPost("Odose cene u nebesa moja Slavice...");
		facebookPost.setKorisnik(korisnik);
		facebookPost.print();

	}

}
