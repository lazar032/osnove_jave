package p22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Film f = new Film("Blade Runner 2049", 2017);

		Reziser r = new Reziser("Deni Vilnuve", 54);
		f.setReziser(r);
		
		f.stampaj();

	}

}
