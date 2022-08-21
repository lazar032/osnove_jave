package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		FacebookPost s = new FacebookPost();
		s.setDeljenja(5);
		s.setImeIPrezimeAktera("Marko Markovic");
		s.setImeIPrezimeProfila("Bojan Bojanic");
		s.setLajkovi(56);
		s.setObjava("Cao Bojane!");
		s.print();
		FacebookPost f = new FacebookPost("Pera Peric", "Zlata Zlatic", "Cao Zlato!");
		f.setLajkovi(10);
		f.setDeljenja(2);
		f.like();
		f.dislike();
		f.share();
		f.print();
		
		

	}

}
