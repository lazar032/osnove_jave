package p25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		FacebookPost objava = new FacebookPost("Lazar Mitrovic", "Pijem pivu, rakiju i sljivu. Garo, Garo, slomicu te zivu.");
		Reakcija smile1 = new Reakcija("Smajli", "Marko Markovic");
		Reakcija smile2 = new Reakcija("Smajli", "Milos Milosevic");
		Reakcija smile3 = new Reakcija("Smajli", "Mina Minic");
		Reakcija like1 = new Reakcija("Lajk", "Milos Milosevic");
		Reakcija like2 = new Reakcija("Lajk", "Lazar Lazarevic");
		Reakcija heart = new Reakcija("Srce", "Konstantin Konstantinovic");
		
		objava.reaguj(heart);
		objava.reaguj(like2);
		objava.reaguj(like1);
		objava.reaguj(smile3);
		objava.reaguj(smile2);
		objava.reaguj(smile1);
		objava.print();
		

	}

}
