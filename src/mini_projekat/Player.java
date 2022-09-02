package mini_projekat;

public class Player {
	private String imeIPrezime;

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public Player(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}
	
	public void print() {
		System.out.println(imeIPrezime);
	}

}
