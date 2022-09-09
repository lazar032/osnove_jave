package d06_09_2022;

public class Alpinista extends Planinar{
	private int brojPoena;

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	public Alpinista(int identifikacioniKod, String imeIPrezime, int brojPoena) {
		super(identifikacioniKod, imeIPrezime);
		this.brojPoena = brojPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id:" + super.identifikacioniKod);
		System.out.println("Ime: " + super.imeIPrezime);
		System.out.println("Broj poena: " + this.brojPoena);
		
	}

	@Override
	public int clanarina() {
		int cenaSapopustom = 1500 - this.brojPoena * 50;
		
		return cenaSapopustom;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisina() < 4000) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
