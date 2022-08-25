package d23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Racun lazar = new Racun("170-5464654-99", "Lazar Mitrovic", 20000);
		Racun pera = new Racun("111-13123-4444", "Pera Peric", 52000);
		
		
		lazar.stampaj();
		pera.stampaj();
		
		Transakcija transakcija1 = new Transakcija("123", lazar, pera);
		
		transakcija1.transakcijaMetoda(50000);
		
		transakcija1.stampaj();
		
		lazar.stampaj();
		pera.stampaj();


	}

}
