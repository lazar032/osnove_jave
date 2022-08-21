package d18_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezina;
	
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
	}
	
	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}
	public double vratiCenuSaPopustom(int popust) {
		return this.cena * popust / 100;
	}
	public int racunajPostarinu() {
		if (tezina <= 100) {
			return 200;
		} else if (tezina > 101 && tezina < 500) {
			return 400;
		}
		return 1000;
	}

}
