package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//		U glavnom programu napraviti vise autora sa vise knjiga.
		Autor andric = new Autor("Ivo", "Andric");
		Autor jalom = new Autor("Irvin", "Jalom");
		Knjiga naDrini = new Knjiga("12312-3123", "Na Drini cuprija", 1945);
		Knjiga prokAvlija = new Knjiga("123123-313123", "Prokleta avlija", 1954);
		Knjiga kauc = new Knjiga("1231-34315", "Lezanje na kaucu", 1996);
		Knjiga nice = new Knjiga("12313-41442", "Kad je Nice plakao", 1992);
		naDrini.setAutor(andric);
		prokAvlija.setAutor(andric);
		kauc.setAutor(jalom);
		nice.setAutor(jalom);
		naDrini.print();
		System.out.println();
		prokAvlija.print();
		System.out.println();
		kauc.print();
		System.out.println();
		nice.print();


	}

}
