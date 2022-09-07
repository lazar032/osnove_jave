package p06_09_2022;

public class Kuca extends Objekat{
	private int brojClanova;

	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}

	public Kuca(String ulicaIBroj, int povrsina, int zona, int brojClanova) {
		super(ulicaIBroj, povrsina, zona);
		this.brojClanova = brojClanova;
	}

	@Override
	public double porez() {
		return koeficijent() * super.povrsina;
	}

	@Override
	public void stampaj() {
		System.out.println("Ulica i broj: " + super.ulicaIBroj);
		System.out.println("Povrsina: " + super.povrsina);
		System.out.println("Zona: " + super.zona);
		System.out.println("Broj clanova: " + this.brojClanova);
		
	}
	
	

}
