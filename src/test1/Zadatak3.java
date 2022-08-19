package test1;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo 
//		unosi lozinku a zatim program od korisnika zahteva unos kojim potvrdjuje 
//		lozinku sve dok se ne poklopi sa lozinkom ili dok mu se ne blokira mogucnost 
//		postavljanja lozinke. Korisnik moze maksimalno 3 puta da pogresi potvrdu lozinke.
//		Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//		Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku 
//		“Mogucnost postavljanja lozinke je blokirana”
//		Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena” 
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite lozinku: ");
		String prvaLozinka = s.next();
		String drugaLozinka = "";
		int brojac = 0;
		int ispravno = 0;
		
		while (brojac < 3 && ispravno == 0) {
			System.out.print("Potvrdite lozinku: ");
			drugaLozinka = s.next();
			if (prvaLozinka.equals(drugaLozinka)) {
				System.out.println("Lozinka je uspesno postavljena");
				ispravno++;
			}
			else {
				System.out.println("Lozinke se ne poklapaju.");
				brojac++;
			}
			
		}
		if (brojac == 3) {
			System.out.println("Mogucnost postavljanja lozinke je blokirana");
		}


	}

}
