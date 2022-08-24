package p23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		FizickoLice kupac = new FizickoLice("Pera Peric", "1111132", "24126692525", true);
		FizickoLice prodavac = new FizickoLice("Marko Markovic", "1231414", "25221565497", true);
		Ugovor ugovor = new Ugovor("24.5.2022.", 152000, "Prote Mateje 33");
		ugovor.setKupac(kupac);
		ugovor.setProdavac(prodavac);
		ugovor.stampaj();

	}

}
