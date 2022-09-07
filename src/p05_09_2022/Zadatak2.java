package p05_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		VisaKartica pera = new VisaKartica(352, "3265-5465-4567-9874", 2023, 11, "Pera Peric");
		MasterKartica nikola = new MasterKartica(123, "3265-5465-4567-9874", 2022, 12);
		
		
		pera.dodajSredstva(12.5);
		nikola.izvrsiTransakciju(17.7);
		pera.stampaj();
		nikola.stampaj();

	}

}
