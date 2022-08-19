package test1;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji cuva dva niza celih brojeva, jedan za parne brojeve a 
//		drugi za neparne brojeve. Program sa tastature ucitava N brojeva koje unosi 
//		korisnik i parne brojeve dodaje u niz parnih brojeva a neparne brojeve u niz 
//		neparnih. Na kraju programa odstampati brojeve oba niza. 
//		Nizovi se stampaju koristeci petlje.
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		String parni = "";
		String neparni = "";
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			if (broj % 2 == 0) {
				parni = parni + broj + ", ";
			} else {
				neparni = neparni + broj + ", ";
			}
		}
		System.out.println("Niz parnih: " + parni);
		System.out.println("Niz neparnih " + neparni);


	}

}
