package p15_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		operacijeBrojeva(s.nextInt(), s.nextInt());
				
	}
	
	public static void operacijeBrojeva(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
	}

}
