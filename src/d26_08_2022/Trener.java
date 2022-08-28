package d26_08_2022;

public class Trener extends Osoba{
	private int godineIskustva;
	private String tip;
	
	public Trener(String imeIPrezime, String jmbg, int godRodjenja, int godineIskustva, String tip) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.godineIskustva = godineIskustva;
		this.tip = tip;
	}


	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println(godineIskustva + ", " + tip);
	}

}
