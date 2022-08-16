package p16_08_2022;

public class Auto {
	public String vlasnik;
	public String marka;
	public String brojVrata;
	public double potrosnja;
	public int trenutnaBrzina;

	public void stampaj() {
		System.out.println(this.vlasnik);
		System.out.println(this.marka + " - " + this.brojVrata + "-ra vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina.");
	}

	public boolean prekoracenje(int ogranicenje) {
		if (this.trenutnaBrzina <= ogranicenje) {
			return true;
		}
		return false;
	}
}

