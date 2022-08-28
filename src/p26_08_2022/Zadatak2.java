package p26_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		VisaKartica visa = new VisaKartica(320, "13215", 2022, 9, "Pera Peric");
		MasterKartica master = new MasterKartica(150, "123156", 2022, 5);
		
		visa.stampaj();
		master.stampaj();

	}

}
