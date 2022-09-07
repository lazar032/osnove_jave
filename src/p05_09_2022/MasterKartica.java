package p05_09_2022;

public class MasterKartica extends PlatnaKartica{

	public MasterKartica(double suma, String broj, int godina, int mesec) {
		super(suma, broj, godina, mesec);
	}

	@Override
	public void izvrsiTransakciju(double skini) {
		double provizija = skini * 0.015;
		super.suma -= (skini + provizija);
	}

	public void naplatiOdrzavanje() {
		this.suma -= 2;
	}
	@Override
	public void stampaj() {
		System.out.println("Master Card: " + super.broj + ", " + super.mesec + "," + super.godina + 
				", $" + super.suma);
		
	}
	

}
