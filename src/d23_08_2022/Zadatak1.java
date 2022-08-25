package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne 
//			(ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke 
//			za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		ArrayList<ZeleniKarton> karton = new ArrayList<>();
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Mehanika 1", "Milan Maric", 10));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Mehatronika", "Lazar Lazarevic", 7));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Matematika 1", "Mina Minic", 5));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Matematika 2", "Ognjen Markovic", 10));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Matematika 3", "Sara Planic", 6));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Fizika", "Ognjen Markovic", 8));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Mehanika 2", "Vukasin Vuletic", 5));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Mehanika 3", "Milos Micic", 5));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Sociologija", "Sanja Petrovic", 10));
		karton.add(new ZeleniKarton("Pera Peric", "132/15", "Engleski", "Milovan Ristic", 5));
		
		for (int i = 0; i < karton.size(); i++) {
			karton.get(i).stampaj();
		}
		
		double ocene = 0;
		for (int i = 0; i < karton.size(); i++) {
			ocene = ocene + karton.get(i).getOcena();
		}
		double prosecnaOcena = ocene / (karton.size() + 1);
		System.out.println("Prosecna ocena je: " + prosecnaOcena);
		
		double prosekPolozenih = 0;
		double ocenePolozenih = 0;
		int brojac = 0;
		for (int i = 0; i < karton.size(); i++) {
			if (karton.get(i).polozenIspit() == true) {
				ocenePolozenih = ocenePolozenih + karton.get(i).getOcena();
				brojac++;
			}
		}
		prosekPolozenih = ocenePolozenih / brojac;
		System.out.println("Prosek polozenih je: " + prosekPolozenih);

	}

}
