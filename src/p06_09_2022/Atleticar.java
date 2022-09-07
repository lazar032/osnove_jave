package p06_09_2022;

public abstract class Atleticar {
	private String imeIPrezime;
	protected int rezultat;
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	public int getRezultat() {
		return rezultat;
	}
	
	public Atleticar(String imeIPrezime, int rezultat) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.rezultat = rezultat;
	}
	
	public abstract boolean boljiAtleticar(Atleticar atleticar);
	
	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.rezultat);
	}
	

}
