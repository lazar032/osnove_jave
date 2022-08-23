package p22_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod("Snikers", 70);
		ClanskaKarta clanskaKarta = new ClanskaKarta(10, "123415-2313");
		Kupac kupac = new Kupac("Lazar Mitrovic");
		kupac.setClanskaKarta(clanskaKarta);
		proizvod.setKupac(kupac);
		proizvod.stampaj();
	}

}
