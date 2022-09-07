package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Magacioner pera = new Magacioner("Pera Peric");
		Menadzer nikola = new Menadzer("Nikola Nikolic");
		Sektor sektor1 = new Sektor("Sektor 1", 25000);
		Sektor sektor2 = new Sektor("Sektor 1", 27000);
		Sektor sektor3 = new Sektor("Sektor 1", 30000);
		Sektor sektor4 = new Sektor("Sektor 1", 35000);
		pera.zaposliUSektor(sektor1);
		pera.zaposliUSektor(sektor3);
		nikola.zaposliUSektor(sektor2);
		nikola.zaposliUSektor(sektor4);
		pera.stampaj();
		nikola.stampaj();

	}

}
