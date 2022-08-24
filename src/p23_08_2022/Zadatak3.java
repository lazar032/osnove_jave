package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj sastojaka: ");
		int n = s.nextInt();
		ArrayList<Sastojak> sastojci = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite sastojak: ");
			String x = s.next();
			System.out.print("Unesite cenu: ");
			int y = s.nextInt();
			sastojci.add(new Sastojak(x, y));
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println(sastojci.get(i).getNaziv());
			System.out.println(sastojci.get(i).getCena());
		}

	}

}
