package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
	private String imeIPrezime;
	private String tekst;
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();

	public void reaguj(Reakcija reakcija) {
		for (int i = 0; i < reakcije.size(); i++) {
			if (reakcija.getImeIPrezime().equals(reakcije.get(i).getImeIPrezime())) {
				this.reakcije.remove(i);
			}
		}
		this.reakcije.add(reakcija);
	}

	private int brojReakcija(String reakcija) {
		int brojReakcija = 0;
		for (int i = 0; i < this.reakcije.size(); i++) {
			if (this.reakcije.get(i).getTip().equals(reakcija)) {
				brojReakcija++;
			}
		}
		return brojReakcija;
	}
	

	public void print() {
		System.out.println(imeIPrezime);
		System.out.println(tekst);

		System.out.print("Smajli " + brojReakcija("Smajli") + " | ");
		System.out.print("Srce " + brojReakcija("Srce") + " | ");
		System.out.print("Lajk " + brojReakcija("Lajk"));

	}

	public FacebookPost(String imeIPrezime, String tekst) {
		this.imeIPrezime = imeIPrezime;
		this.tekst = tekst;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public ArrayList<Reakcija> getReakcije() {
		return reakcije;
	}

	public void setReakcije(ArrayList<Reakcija> reakcije) {
		this.reakcije = reakcije;
	}

}
