package d15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		System.out.println(slaganjeBrojeva(2, 5));

	}
	public static int slaganjeBrojeva(int a, int b) {
		String brojA = "" + a;
		String brojB = "" + b;
		int c = Integer.valueOf(brojA + brojB);
		return c;
	}

}
