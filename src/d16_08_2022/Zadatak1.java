package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Proizvod p = new Proizvod();
		p.cena = 100;
		p.naziv = "Secer";
		p.gramaza = 1500;
		p.konvertuj("kg");
		p.stampaj();

	}

}
