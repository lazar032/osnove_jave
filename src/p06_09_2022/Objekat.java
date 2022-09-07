package p06_09_2022;

public abstract class Objekat {
	protected String ulicaIBroj;
	protected int povrsina;
	protected int zona;
	public String getUlicaIBroj() {
		return ulicaIBroj;
	}
	public void setUlicaIBroj(String ulicaIBroj) {
		this.ulicaIBroj = ulicaIBroj;
	}
	public int getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(int povrsina) {
		this.povrsina = povrsina;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public Objekat(String ulicaIBroj, int povrsina, int zona) {
		super();
		this.ulicaIBroj = ulicaIBroj;
		this.povrsina = povrsina;
		this.zona = zona;
	}
	
	public double koeficijent() {
		if (this.zona == 1) {
			return 1.4;
		} else if (this.zona == 2) {
			return 1.1;
		} else if (this.zona == 3) {
			return 1.05;
		} else {
			return 0;
		}
	}
	
	public abstract double porez();
	public abstract void stampaj();

}
