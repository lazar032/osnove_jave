package mini_projekat;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Player pera = new Player("Pera Peric");
		Player nikola = new Player("Nikola Nikolic");
		XandOGame igra1 = new XandOGame(pera, nikola);
		igra1.startGame();
		while (igra1.gameScore() == 0) {
			System.out.println("Unesite poziciju poteza: ");
			igra1.makeAMove(s.nextInt());
			igra1.playNext();
		}
		igra1.print();
	}

}
