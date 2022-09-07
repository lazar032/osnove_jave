package p06_09_2022;

public class Zgrada extends Objekat{
	private int brojStanova;

	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}

	public Zgrada(String ulicaIBroj, int povrsina, int zona, int brojStanova) {
		super(ulicaIBroj, povrsina, zona);
		this.brojStanova = brojStanova;
	}
	
	@Override
	public double porez() {
		return koeficijent() * super.povrsina * this.brojStanova;
	}
	
	@Override
	public void stampaj() {
		System.out.println("Ulica i broj: " + super.ulicaIBroj);
		System.out.println("Povrsina: " + super.povrsina);
		System.out.println("Zona: " + super.zona);
		System.out.println("Broj stanova: " + this.brojStanova);
		
	}

}
