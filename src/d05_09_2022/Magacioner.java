package d05_09_2022;

public class Magacioner extends Radnik{
	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
	}

	private double prosecnaPlata() {
		double plataRadnika = 0;
		for (int i = 0; i < sektori.size(); i++) {
			plataRadnika += sektori.get(i).getPlata();
		}
		double prosecnaPlata = plataRadnika / (sektori.size() + 1) * 0.5;
		return prosecnaPlata;
	}

	@Override
	public double plataRadnika() {
		return prosecnaPlata() * (sektori.size() + 1);
	}
	
	@Override
	public void stampaj() {
		System.out.println(super.imeIPrezime);
		System.out.println(plataRadnika());
		
	}

}
