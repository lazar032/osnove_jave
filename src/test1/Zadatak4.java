package test1;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. 
//		Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti
//		konverziju a vraca konvertovanu vrednost.
		konverzija(3.5, "dm");

	}
	public static void konverzija(double metara, String jedinica) {
		double konvertovani = 0;
		if (jedinica.equals("cm")) {
			 konvertovani = metara * 100;
			 System.out.println(metara + "m je " + konvertovani + "cm");
		} else if (jedinica.equals("dm")) {
			 konvertovani = metara * 10;
			 System.out.println(metara + "m je " + konvertovani + "dm");
		} else if (jedinica.equals("km")) {
			 konvertovani = metara * 0.001;
			 System.out.println(metara + "m je " + konvertovani + "km");
		}
	}

}
