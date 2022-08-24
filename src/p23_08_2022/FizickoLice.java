package p23_08_2022;

public class FizickoLice {
	private String imeIPrezime;
	private String brojLK;
	private String jmbg;
	private boolean daLiJeKupovala;
	
	public boolean getDaLiJeKupovala() {
		return daLiJeKupovala;
	}

	public void setDaLiJeKupovala(boolean daLiJeKupovala) {
		this.daLiJeKupovala = daLiJeKupovala;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getBrojLK() {
		return brojLK;
	}

	public void setBrojLK(String brojLK) {
		this.brojLK = brojLK;
	}

	public String getJmbg() {
		return jmbg;
	}

	public FizickoLice(String imeIPrezime, String brojLK, String jmbg, boolean daLiJeKupovala) {
		this.imeIPrezime = imeIPrezime;
		this.brojLK = brojLK;
		this.jmbg = jmbg;
		this.daLiJeKupovala = daLiJeKupovala;
	}
	
	

	public void stampaj() {
		System.out.println(this.imeIPrezime + ", " + this.brojLK);
	}
	
	

}
