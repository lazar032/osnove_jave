package p19_08_2022;

public class Radnik {
	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int strucnaSprema;
	private int godineStaza;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	public Radnik(String jmbg, String imeIPrezime, int brojDece, int strucnaSprema, 
			int godineStaza) {
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrezime;
		this.brojDece = brojDece;
		this.strucnaSprema = strucnaSprema;
		this.godineStaza = godineStaza;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void setBrojDece(int brojDece) {
		this.brojDece = brojDece;
	}
	public void setStrucnaSprema(int strucnaSprema) {
		this.strucnaSprema = strucnaSprema;
	}
	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
	public String getJmbg() {
		return jmbg;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public int getBrojDece() {
		return brojDece;
	}
	public int getStrucnaSprema() {
		return strucnaSprema;
	}
	public int getGodineStaza() {
		return godineStaza;
	}
	
	public double minuliRad() {
		if (godineStaza < 10) {
			return 0.05;
		} else if (godineStaza >= 10 && godineStaza < 20) {
			return 0.075;
		} else if (godineStaza >= 20) {
			return 0.1;
		}
		return 0;
	}
	public double koeficijent() {
		if (strucnaSprema == 1) {
			return 1.03;
		} else if (strucnaSprema == 2) {
			return 1.65;
		} else if (strucnaSprema == 3) {
			return 2.00;
		} else if (strucnaSprema == 4) {
			return 2.27;
		} else if (strucnaSprema == 5) {
			return 2.88;
		} else if (strucnaSprema == 6) {
			return 3.09;
		} else if (strucnaSprema == 7) {
			return 3.40;
		} else if (strucnaSprema == 8) {
			return 4.12;
		} 
		return 0;
	}
	public double plata() {
		return 25000 + (koeficijent() + minuliRad()) * 10000;
	}
	public boolean kredit() {
		if (plata() > 50000) {
			return true;
		}
		return false;
	}
	public void stamapaj() {
		System.out.println(this.plata());
	}

}
