package p16_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Auto a = new Auto();
		a.vlasnik = "Lazar Mitrovic";
		a.brojVrata = "5";
		a.marka = "Fiat";
		a.potrosnja = 5;
		a.trenutnaBrzina = 120;
		a.godinaProizvodnje = 2012;
		a.registracija = 3;
		a.kubikaza = 1249;
		a.brojRegistracije = 12314;
		a.klima = false;
		a.maksimalnaBrzina = 180;
		a.stampajTablu();
		a.stampaj();
		a.prekoracenje(50);

	}

}
