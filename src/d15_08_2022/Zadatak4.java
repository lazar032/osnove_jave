package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		podaci("213124", "Lazar", "Mitrovic", 1996, true);

	}
	public static void podaci(String jmbg, String ime, String prezime, int godRodj, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godRodj);
		System.out.println("Aktivan: " + aktivan);
	}

}
