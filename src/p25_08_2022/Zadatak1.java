package p25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Pasta carbonara = new Pasta();
		
		Sastojak jaja = new Sastojak("Jaja", 200);
		Sastojak biber = new Sastojak("Biber", 50);
		Sastojak slanina = new Sastojak("Slanina", 150);
		Sastojak spagete = new Sastojak("Spagete", 120);
		carbonara.dodajSastojak(spagete);
		carbonara.dodajSastojak(slanina);
		carbonara.dodajSastojak(biber);
		carbonara.dodajSastojak(jaja);
		carbonara.brisiSastojak("Spagete");
		carbonara.stampaj();

	}

}
