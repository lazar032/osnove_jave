package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
	private String naziv;
	private String tip;
	ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Disciplina(String naziv, String tip) {
		super();
		this.naziv = naziv;
		this.tip = tip;
	}
	
	public void dodajAtleticara(Atleticar atleticar) {
		atleticari.add(atleticar);
	}
	
	public void diskvalifikujAtleticara(String imeIPrezime) {
		for (int i = 0; i < atleticari.size(); i++) {
			if (atleticari.get(i).getImeIPrezime().equals(imeIPrezime)) {
				atleticari.remove(i);
			}
		}
	}

}
