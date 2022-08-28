package p26_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		EONPaket eonPaket = new EONPaket("Pera Peric", 2000, 12);
		DUOPaket duoPaket = new DUOPaket("Marko Markovic", 3500, 24);
		
		eonPaket.stampaj();
		System.out.println();
		duoPaket.stampaj();

	}

}
