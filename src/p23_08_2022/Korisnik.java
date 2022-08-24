package p23_08_2022;

public class Korisnik {
	private String imeIPrezime;
	private String tipLicence;
	
	public Korisnik() {
		this.tipLicence = "Basic";
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipLicence() {
		return tipLicence;
	}

	public void setTipLicence(String tipLicence) {
		this.tipLicence = tipLicence;
	}
	
	public  void pretplatiSe(int suma) {
		if (suma == 100) {
			this.tipLicence = "Pro";
		} else if (suma == 150) {
			this.tipLicence = "Premium";
		}
	}
	
	public void ponistiPretplatu() {
		this.tipLicence.equals("Basic");
	}
	
	public double maxTrajanjePoziva() {
		if (this.tipLicence.equals("Basic")) {
			return 40;
		} else if (this.tipLicence.equals("Pro")) {
			return 240;
		} else if (this.tipLicence.equals("Premium")) {
			return 1440;
		}
		return 0;
	}
	
	public void print() {
		System.out.println(this.imeIPrezime);
	}

	public Korisnik(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
		this.tipLicence = "Basic";
	}

	

}
