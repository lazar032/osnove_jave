package p06_09_2022;

public class Lokal extends Objekat{

	public Lokal(String ulicaIBroj, int povrsina, int zona) {
		super(ulicaIBroj, povrsina, zona);
	}
	
	@Override
	public double porez() {
		return koeficijent() * super.povrsina * 1.3;
	}
	
	@Override
	public void stampaj() {
		System.out.println("Ulica i broj: " + super.ulicaIBroj);
		System.out.println("Povrsina: " + super.povrsina);
		System.out.println("Zona: " + super.zona);
		
	}

}
