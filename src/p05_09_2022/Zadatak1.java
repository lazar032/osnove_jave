package p05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		StudentOsnovnih pera = new StudentOsnovnih("Pera Peric", "326/15", 3);
		StudentMaster nikola = new StudentMaster("Nikola Nikolic", "564/14", 3);
		
		pera.stampaj();
		nikola.stampaj();

	}

}
