package p06_09_2022;

public class IcePoint extends Proizvod{
	private String tip;
	private boolean velicina;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public boolean isVelicina() {
		return velicina;
	}
	public void setVelicina(boolean velicina) {
		this.velicina = velicina;
	}
	public IcePoint(String tip, boolean velicina) {
		super();
		this.tip = tip;
		this.velicina = velicina;
	}
	
	@Override
	public void ukupnaCena() {
		int ukupnaCena = 0;
		for (int i = 0; i < dodaci.size(); i++) {
			ukupnaCena += dodaci.get(i).getCena();
		}
		if (this.velicina == true) {
			ukupnaCena += 130;
		} else {
			ukupnaCena += 100;
		}
		System.out.println("Ukupna cena: " + ukupnaCena);
	}
	
	@Override
	public void stampaj() {
		System.out.println("Tip je: " + tip);
		if (velicina == true) {
			System.out.println("Veliki sladoled");
		} else {
			System.out.println("Mali sladoled");
		}
		for (int i = 0; i < dodaci.size(); i++) {
			dodaci.get(i).stampaj();
		}
	}
	
	
	

}
