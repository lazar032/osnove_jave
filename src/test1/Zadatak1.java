package test1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak (Grananja)
//		Napisati program koji simulira notifikaciju za novu verziju aplikacije.
//		Korisnik unosi verziju aplikacije koju ima instaliranu na svom racunaru a
//		zatim najnoviju verziju, nakon cega se ispisuje notifikacija.
//		Verzija aplikacije se sastoji od major i minor broja. Aplikacije imaju 
//		verziju uglavnom u formatu major.minor i primer bi bio Facebook 2.1 gde 
//		je major=2 i minor=1 Aplikacija je novije verzije ukoliko je: major broj veci ili
//		ukoliko je major isti, tada nova verzija ima veci minor
//
//		Napomena: Smatrati da korisnik za najnoviju verziju unosi vecu ili istu
//		verziju od instalirane, nikako manju.
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite major verziju instalirane aplikacije: ");
		int majorInstalirane = s.nextInt();
		System.out.print("Unesite minor verziju instalirane aplikacije: ");
		int minorInstalirane = s.nextInt();
		System.out.println("Na racunaru je instalirana verzija " + majorInstalirane
				+ "." + minorInstalirane);
		System.out.print("Unesite major verziju najnovije aplikacije: ");
		int majorNajnovije = s.nextInt();
		System.out.print("Unesite minor verziju najnovije aplikacije: ");
		int minorNajnovije = s.nextInt();
		System.out.println("Najnovija verzija je " + majorNajnovije
				+ "." + minorNajnovije);
		if (majorInstalirane < majorNajnovije) {
			System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za"
					+ " instalaciju.");
		} else if (majorInstalirane == majorNajnovije && minorInstalirane < minorNajnovije) {
			System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za"
					+ " instalaciju.");
		} else {
			System.out.println("Notifikacija: Vec imate najnoviju verziju na svom racunaru.");
		}
		
		



	}

}
