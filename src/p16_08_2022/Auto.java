package p16_08_2022;

public class Auto {
	public String vlasnik;
	public String marka;
	public String brojVrata;
	public double potrosnja;
	public int trenutnaBrzina;
	public int godinaProizvodnje;
	public int registracija;
	public int kubikaza;
	public int brojRegistracije;
	public boolean klima;
	public int maksimalnaBrzina;

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
	public boolean oldtajmer() {
		if (godinaProizvodnje < 1950) {
			return true;
		}
		return false;
	}
	public boolean istekRegistracije(int trenutniMesec) {
		if (trenutniMesec > registracija) {
			return true;
		}
		return false;
	}
	public double cenaRegistracije() {
		
		if (this.kubikaza < 1000) {
			return kubikaza * 100;
		} 
		return kubikaza * 100 * 1.3;
	}
	public void dodajGas() {
		if (this.trenutnaBrzina < this.maksimalnaBrzina - 10) {
			this.trenutnaBrzina = this.trenutnaBrzina + 10;
		}
	}
	public void koci() {
		this.trenutnaBrzina = this.trenutnaBrzina - 10;
	}
	public double potrosnja() {
		double faktorKlime = 1.2;
		double prosecnaPotrosnja = trenutnaBrzina / 100 * potrosnja;
		if (klima == true) {
			return prosecnaPotrosnja * faktorKlime;
		}
		return prosecnaPotrosnja;
	}
	public void stampajTablu() {
		int brojCrtica = trenutnaBrzina * 100 / maksimalnaBrzina;
		for (int i = 0; i < 100; i++) {
			if (brojCrtica > i) {
				System.out.print("|");
			} else {
				System.out.print(".");
			}
		}
		System.out.println(trenutnaBrzina + "/" + maksimalnaBrzina + "km/h");
	}
	
}

