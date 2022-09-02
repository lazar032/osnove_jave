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
			System.out.print("Unesite poziciju poteza: ");
			int p = s.nextInt();
			if (igra1.isValidMove(p) == true && igra1.isFieldFree(p) == true) {
				igra1.makeAMove(p);
				igra1.print();
				igra1.playNext();
			} else {
				System.out.println("You entered invalid position.");
			}
			
		}
		
	}

}
