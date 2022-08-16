package p16_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Auto a = new Auto();
		a.vlasnik = "Lazar Mitrovic";
		a.brojVrata = "5";
		a.marka = "Fiat";
		a.potrosnja = 5;
		a.trenutnaBrzina = 120;
		a.stampaj();
		a.prekoracenje(50);

	}

}
