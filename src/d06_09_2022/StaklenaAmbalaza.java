package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
	private double kaucija;
	private boolean daLiJeDonetaFlasa;
	private double osnovnaCena;
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isDaLiJeDonetaFlasa() {
		return daLiJeDonetaFlasa;
	}
	public void setDaLiJeDonetaFlasa(boolean daLiJeDonetaFlasa) {
		this.daLiJeDonetaFlasa = daLiJeDonetaFlasa;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija,
			boolean daLiJeDonetaFlasa, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiJeDonetaFlasa = daLiJeDonetaFlasa;
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if (daLiJeDonetaFlasa == true) {
			return this.osnovnaCena * 1.2;
		} else {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}
	}
	@Override
	public void stampaj() {
		System.out.println("Artikal: " + super.nazivArtikla);
		System.out.println("Barkod: " + super.barkod);
		System.out.println("Da li ste doneli flasu: " + this.daLiJeDonetaFlasa);
		System.out.println("Kaucija je: " + this.kaucija);
		System.out.println("Cena je: " + cenaArtikla());
		
		
	}
	
	

}
