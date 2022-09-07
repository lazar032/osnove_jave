package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Korpa korpa = new Korpa();
		Tetrapak tetrapak = new Tetrapak("465465", "Kravica", 120, 200, true, 100);
		StaklenaAmbalaza staklo = new StaklenaAmbalaza("64894", "Zajecarac", 150, 250, 50, true, 15);
		SuperKartica pera = new SuperKartica("1234", "Pera Peric", 10);
		
		korpa.dodajAmbalazu(staklo);
		korpa.dodajAmbalazu(tetrapak);
		pera.stampaj();
		korpa.cenaKorpe(pera);

	}

}
