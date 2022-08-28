package p25_08_2022;

public class HistoryPage {
	private String nazivStranice;
	private String url;
	private int sat;
	private int minut;
	private String kolacici;
	
	public HistoryPage(String nazivStranice, String url, int sat, int minut) {
		this.nazivStranice = nazivStranice;
		this.url = url;
		this.sat = sat;
		this.minut = minut;
	}

	public String getNazivStranice() {
		return nazivStranice;
	}

	public void setNazivStranice(String nazivStranice) {
		this.nazivStranice = nazivStranice;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSat() {
		return sat;
	}

	public void setSat(int sat) {
		this.sat = sat;
	}

	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		this.minut = minut;
	}

	public String getKolacici() {
		return kolacici;
	}
	
	public void sacuvajKredencijale(String kredencijali) {
		kolacici = kredencijali;
	}
	
	public void obrisiKolacice() {
		kolacici = null;
	}
	
	public void stampaj() {
		System.out.println(sat + " - " + minut + " - " + nazivStranice + 
				"..." + url);
	}

}
