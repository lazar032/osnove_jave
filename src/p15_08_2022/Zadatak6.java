package p15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite broj zvezdica: ");
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			brojZvezdica(i);
			System.out.println();
		}
	}

	public static void brojZvezdica(int z) {
		for (int i = z; i > 0; i--) {
			System.out.print("* ");
		}

	}

}
