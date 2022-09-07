package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {
	private String imeGrada;
	ArrayList<Objekat> objekti = new ArrayList<Objekat>();
	
	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
	}

	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	
	
	public void dodajObjekat(Objekat objekat) {
		objekti.add(objekat);
	}
	
	public void ukupanPorez() {
		double ukupanPorez = 0;
		for (int i = 0; i < objekti.size(); i++) {
			ukupanPorez += objekti.get(i).porez();
		}
		System.out.println("Ukupan porez je: " + ukupanPorez);
	}
	
	public void print() {
		for (int i = 0; i < objekti.size(); i++) {
			objekti.get(i).stampaj();
		}
	}
	
	public Objekat najveciPorez() {
		int tajObjekat = 0;
		double najveciPorez = 0;
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() > najveciPorez) {
				najveciPorez = objekti.get(i).porez();
				tajObjekat = i;
			}
		}
		return objekti.get(tajObjekat);	
	}
	
	public Objekat najmanjiPorez() {
		int tajObjekat = 0;
		double najmanjiPorez = 0;
		for (int i = 0; i < objekti.size(); i++) {
			if (objekti.get(i).porez() < najmanjiPorez) {
				najmanjiPorez = objekti.get(i).porez();
				tajObjekat = i;
			}
		}
		return objekti.get(tajObjekat);
	}

}
