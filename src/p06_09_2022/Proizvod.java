package p06_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();
	
	public void ubaciDodatak(Dodatak dodatak) {
		dodaci.add(dodatak);
	}
	
	public void ceneProizvoda() {
		for (int i = 0; i < dodaci.size(); i++) {
			dodaci.get(i).getCena();
		}
	}
	
	public abstract void ukupnaCena();
	
	public abstract void stampaj();

}
