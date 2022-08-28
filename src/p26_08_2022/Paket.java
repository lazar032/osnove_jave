package p26_08_2022;

public class Paket {
	protected String naziv;
	protected String imeIPrezime;
	protected int cenaMesec;
	protected int ugovorObaveza;
	protected int downloadSpeed;
	protected int uploadSpeed;
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getCenaMesec() {
		return cenaMesec;
	}
	public void setCenaMesec(int cenaMesec) {
		this.cenaMesec = cenaMesec;
	}
	public int getDownloadSpeed() {
		return downloadSpeed;
	}
	public void setDownloadSpeed(int downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}
	public String getNaziv() {
		return naziv;
	}
	public int getUgovorObaveza() {
		return ugovorObaveza;
	}
	public int getUploadSpeed() {
		return uploadSpeed;
	}
	public Paket(String naziv, String imeIPrezime, int cenaMesec, int ugovorObaveza, int downloadSpeed,
			int uploadSpeed) {
		super();
		this.naziv = naziv;
		this.imeIPrezime = imeIPrezime;
		this.cenaMesec = cenaMesec;
		this.ugovorObaveza = ugovorObaveza;
		this.downloadSpeed = downloadSpeed;
		this.uploadSpeed = uploadSpeed;
	}
	
	public void produziUgovor() {
		ugovorObaveza += 12;
	}
	public int poDinar() {
		return 0;
	}
	
	public void stampaj() {
		System.out.println(imeIPrezime);
		System.out.println(naziv + " - " + downloadSpeed + "/" + uploadSpeed + " - " + 
		ugovorObaveza);
		System.out.println(cenaMesec);
	}

}
