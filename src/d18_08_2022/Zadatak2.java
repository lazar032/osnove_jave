package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		FacebookPost f = new FacebookPost();
		f.imeIPrezimeAktera = "Pera Peric";
		f.imeIPrezimeProfila = "Zlata Zlatic";
		f.objava = "Cao Zlato! Kako si?";
		f.lajkovi = 10;
		f.deljenja = 2;
		f.like();
		f.dislike();
		f.share();
		f.print();

	}

}
