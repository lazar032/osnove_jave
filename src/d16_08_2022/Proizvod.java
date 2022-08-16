package d16_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double gramaza;
	
	public void stampaj() {
		System.out.println(naziv + ", " + cena + ", " + gramaza);
	}
	public void konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			gramaza = gramaza / 1000;
		} else if (jedinica.equals("t")) {
			gramaza = gramaza / 1000000;
		}
	}

}
