package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Ispit mata = new Ispit("Matematika", 7, "Marko Markovic");
		Ispit fizika = new Ispit("Fizika", 8, "Ana Ivanovic");
		Student student = new Student("326/19", "Pera Peric", "Osnovne");
		student.dodajIspit(fizika);
		student.dodajIspit(mata);
		student.stampaj();

	}

}
