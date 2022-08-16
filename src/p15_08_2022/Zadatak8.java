package p15_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite A: ");
		int a = s.nextInt();
		System.out.println("Unesite B: ");
		int b = s.nextInt();
		System.out.println("Unesite C: ");
		int c = s.nextInt();
		if (a * a + b * b == c * c) {
			pravougliTrougao();
		} 
		
	}
	
	public static boolean pravougliTrougao() {
		return true;
		 
	}

}
