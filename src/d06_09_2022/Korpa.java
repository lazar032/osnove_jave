package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (ambalaze.get(i).getBarkod().equals(barkod)) {
				ambalaze.remove(i);
			}
		}
	}
	
	private double cenaSaPopustom(double popust) {
		double cenaSvih = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			cenaSvih += ambalaze.get(i).cenaArtikla();
		}
		return cenaSvih - (cenaSvih * (popust / 100));
	}
	
	public double cenaKorpe(SuperKartica superKartica) {
		System.out.println(this.cenaSaPopustom(superKartica.getPopust()));
		return this.cenaSaPopustom(superKartica.getPopust());
		
	}
	
}
