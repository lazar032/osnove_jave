package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Racun r = new Racun();
		r.brojRacuna = "113-211-331-112";
		r.imeIPrezime = "Lazar Mitrovic";
		r.stanje = 5000;
		Racun n = new Racun();
		n.brojRacuna = "233-123-315-313";
		n.imeIPrezime = "Marko Markovic";
		n.stanje = 2500;
		
		System.out.println("Posiljalac: " + r.imeIPrezime + ", " + r.brojRacuna
				+ ", " + r.stanje);
		System.out.println("Primalac: " + n.imeIPrezime + ", " + n.brojRacuna
				+ ", " + n.stanje);
		System.out.print("Unesite sumu za transakciju: ");
		int suma = s.nextInt();
		r.stanje = r.stanje - suma;
		n.stanje = n.stanje + suma;
		System.out.println("Posiljalac: " + r.imeIPrezime + ", " + r.brojRacuna
				+ ", " + r.stanje);
		System.out.println("Primalac: " + n.imeIPrezime + ", " + n.brojRacuna
				+ ", " + n.stanje);
		
	}

}
