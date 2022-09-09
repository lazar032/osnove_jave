package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String naziv;
	private int godinaOsnivanja;
	ArrayList<Planinar> clanovi = new ArrayList<Planinar>();
	
	public String getNaziv() {
		return naziv;
	}
	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}
	public PlaninarskiDom(String naziv, int godinaOsnivanja) {
		super();
		this.naziv = naziv;
		this.godinaOsnivanja = godinaOsnivanja;
	}
	public PlaninarskiDom() {
		super();
	}
	
	public void uclaniPlaninara(Planinar planinar) {
		clanovi.add(planinar);
	}
	
	public int brojUspesnih(Planina planina) {
		int brojac = 0;
		for (int i = 0; i < clanovi.size(); i++) {
			if (clanovi.get(i).uspesanUspon(planina) == true) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public void izbaciPlaninara(int kod) {
		for (int i = 0; i < clanovi.size(); i++) {
			if (clanovi.get(i).identifikacioniKod == kod) {
				clanovi.remove(i);
			}
		}
	}
	
	public void stampaj() {
		for (int i = 0; i < clanovi.size(); i++) {
			clanovi.get(i).stampaj();
		}
	}
	
	public int mesecniPrihod() {
		int prihod = 0;
		for (int i = 0; i < clanovi.size(); i++) {
			prihod += clanovi.get(i).clanarina();
		}
		System.out.println(prihod);
		return prihod;
	}

}
