package p15_08_2022;


public class Zadatak4 {

	public static void main(String[] args) {
		apsolutnaVrednost(-2);
				
	}
	
	public static void apsolutnaVrednost(int a) {
		if (a <= 0) {
			System.out.println("Apsolutna vrednost je: " + a * (-1) );
		} else {
			System.out.println("Apsolutna vrednost je: " + a);
		}
	}

}
