package d06_09_2022;

public class Tetrapak extends Ambalaza{
	private boolean recycable;
	private double osnovnaCena;
	public boolean isRecycable() {
		return recycable;
	}
	public void setRecycable(boolean recycable) {
		this.recycable = recycable;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean recycable,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.recycable = recycable;
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if (recycable == true) {
			return super.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}
	@Override
	public void stampaj() {
		System.out.println("Artikal: " + super.nazivArtikla);
		System.out.println("Barkod: " + super.barkod);
		System.out.println("Da li se reciklira: " + recycable);
		System.out.println("Cena je: " + cenaArtikla());
		
		
	}
	
	

}
