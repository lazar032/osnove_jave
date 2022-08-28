package p26_08_2022;

public class MasterKartica extends PlatnaKartica {
	public MasterKartica(double suma, String broj, int godina, int mesec) {
		super(suma, broj, godina, mesec);
	}
	@Override
	public void izvrsiTransakciju(double skini) {
		double provizija = super.suma * 0.015;
		super.suma = super.suma + provizija;
	}
	public void odrzavanjeRacuna() {
		super.suma = super.suma - 2;
	}
	@Override
	public void stampaj() {
		System.out.print("Master Kartica: ");
		System.out.println(mesec + "/" + godina + ", " + broj + ", $" + suma);

	}

}
