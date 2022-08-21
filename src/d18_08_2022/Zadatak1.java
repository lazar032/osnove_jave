package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Proizvod p = new Proizvod();
		p.naziv = "Snikers";
		p.cena = 70;
		p.tezina = 50;
		p.stampaj();
		p.povecajCenu(20);
		p.vratiCenuSaPopustom(50);
		p.racunajPostarinu();

	}

}
