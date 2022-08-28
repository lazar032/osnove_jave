package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Igrac pera = new Igrac("Pera Peric", "2313144", 1996, 17, "Napadac", true);
		Igrac nikola = new Igrac("Nikola Nikolic", "2548866", 1998, 5, "Odbrambeni", false);
		Trener ivan = new Trener("Ivan Ivanovic", "9795652", 1989, 10, "Kondicioni");
		Trener igor = new Trener("Igor Nikolic", "4684943", 1990, 5, "Personalni");
		
		pera.stampaj();
		nikola.stampaj();
		ivan.stampaj();
		igor.stampaj();

	}

}
