package d06_09_2022;

public abstract class Planinar {
	protected int identifikacioniKod;
	protected String imeIPrezime;
	public int getIdentifikacioniKod() {
		return identifikacioniKod;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public Planinar(int identifikacioniKod, String imeIPrezime) {
		super();
		this.identifikacioniKod = identifikacioniKod;
		this.imeIPrezime = imeIPrezime;
	}
	
	public abstract void stampaj();
	
	public abstract int clanarina();
	
	public abstract boolean uspesanUspon(Planina planina);

}
