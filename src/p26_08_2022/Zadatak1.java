package p26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Student pera = new Student("Pera Peric", "0101996782811", "132/15", 25000);
		Student milica = new Student("Milica Milinkovic", "313996782511", "564/15", 12000);

		Profesor marko = new Profesor("Marko Markovic", "213231454", "Matematika, Fizika", 60000);
		Profesor aleksa = new Profesor("Aleksa Aleksic", "21568751489", "Hemija", 50000);
		
		marko.stampaj();
		aleksa.stampaj();
		pera.stampaj();
		milica.stampaj();

		

	}

}
