package p06_09_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		Disciplina skok = new Disciplina("Skok", "U dalj");
		Disciplina sprint = new Disciplina("Trcanje", "110m s preponama");
		Trkac pera = new Trkac("Pera Peric", 1);
		Skakac nikola = new Skakac("Nikola Nikolic", 3);
		Trkac marko = new Trkac("Marko Markovic", 2);
		
		skok.dodajAtleticara(pera);
		skok.dodajAtleticara(marko);
		
	}

}
