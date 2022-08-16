package p15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		System.out.println(negativBroj(n));
		
	}
	
	public static int negativBroj(int broj) {
		return -broj;
		
	}

}
