package d05_09_2022;

public class Menadzer extends Radnik{

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double plataRadnika() {
		double plataRadnika = 0;
		for (int i = 0; i < sektori.size(); i++) {
			plataRadnika = plataRadnika + sektori.get(i).getPlata();
		}
		return plataRadnika;
	}

	@Override
	public void stampaj() {
		System.out.println(super.imeIPrezime);
		System.out.println(plataRadnika());
		
	}

}
