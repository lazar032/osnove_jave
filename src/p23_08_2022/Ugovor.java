package p23_08_2022;

public class Ugovor {
	private String datumSklapanja;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;
	public String getDatumSklapanja() {
		return datumSklapanja;
	}
	public void setDatumSklapanja(String datumSklapanja) {
		this.datumSklapanja = datumSklapanja;
	}
	public FizickoLice getProdavac() {
		return prodavac;
	}
	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}
	public FizickoLice getKupac() {
		return kupac;
	}
	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public double zaradaProdavca() {
		if (kupac.getDaLiJeKupovala() == true) {
			return 0.02;
		} else {
			return 0.03;
		}
		
	}
	
	public double zaradaAgencije() {
		return 1000 + cena * zaradaProdavca();
	}
	
	public void stampaj() {
		System.out.println("Dana " + datumSklapanja + "god sklopljen je ugovor izmedju "
				 + this.prodavac.getImeIPrezime() + " i " + this.kupac.getImeIPrezime() + " o kupovini nekretnine " + adresa + 
				 " po ceni od " + cena + "pri cemu je kupac u obavezi da agenciji isplati "
				 		+ "novcanu vrednost u iznosu od " + zaradaAgencije());
	}
	public Ugovor(String datumSklapanja, int cena, String adresa) {
		this.datumSklapanja = datumSklapanja;
		this.cena = cena;
		this.adresa = adresa;
	}

}
