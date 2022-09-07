package p06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Kuca kuca = new Kuca("Kneza Vase 9", 70, 1, 4);
		Zgrada zgrada = new Zgrada("Bosanska 9", 30, 2, 8);
		Lokal lokal = new Lokal("Balkanska 25", 80, 3);
		PoreskaUprava cacak = new PoreskaUprava("Cacak");
		cacak.dodajObjekat(kuca);
		cacak.dodajObjekat(lokal);
		cacak.dodajObjekat(zgrada);
		cacak.ukupanPorez();
		cacak.najveciPorez();
		cacak.print();

	}

}
