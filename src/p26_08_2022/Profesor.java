package p26_08_2022;

public class Profesor extends Osoba{
	private String predmeti;
	private double plata;
	public String getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(String predmeti) {
		this.predmeti = predmeti;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public Profesor(String imeIPrezime, String jmbg, String predmeti, double plata) {
		super(imeIPrezime, jmbg);
		this.predmeti = predmeti;
		this.plata = plata;
	}
	
	public void povecanjePlate(double povisica) {
		this.plata = this.plata * 1.2;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Predmeti koje predaje su: " + predmeti);
		System.out.println("Plata iznosi: " + plata);
	}

}
