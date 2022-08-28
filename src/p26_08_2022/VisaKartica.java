package p26_08_2022;

public class VisaKartica extends PlatnaKartica {
	private String ovlascenoLice;

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	public VisaKartica(double suma, String broj, int godina, int mesec, String ovlascenoLice) {
		super(suma, broj, godina, mesec);
		this.ovlascenoLice = ovlascenoLice;
	}
	
	@Override
	public void izvrsiTransakciju(double skini) {
		double provizija = super.suma * 0.018;
		if (provizija < 4) {
			provizija = 4;
		}
		super.suma = super.suma + provizija;
	}
	
	@Override
	public void stampaj() {
		System.out.print("Visa Card: ");
		super.stampaj();
	}

}
