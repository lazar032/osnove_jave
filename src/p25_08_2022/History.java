package p25_08_2022;

import java.util.ArrayList;

public class History {
	ArrayList<HistoryPage> stranice = new ArrayList<HistoryPage>();
	
	public void otvoriStranicu(HistoryPage historyPage) {
		this.stranice.add(historyPage);
	}
	
	public void obrisiPremaLinku(String url) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getUrl().equals(url)) {
				this.stranice.remove(i);
			}
		}
	}
	public void obrisiKolaciceSaLinka(String url) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getUrl().equals(url)) {
				this.stranice.get(i).obrisiKolacice();
			}
		}
	}
	public void obrisiIstoriju() {
		this.stranice.removeAll(stranice);
	}
	
	public void sacuvajKredencija(String naziv, String kolacici) {
		for (int i = 0; i < stranice.size(); i++) {
			if (this.stranice.get(i).getNazivStranice().equals(naziv)) {
				this.stranice.get(i).sacuvajKredencijale(kolacici);
			}
		}
	}
	public void obrisiSveKolacice() {
		for (int i = 0; i < stranice.size(); i++) {
			this.stranice.get(i).obrisiKolacice();
		}
	}
	public void obrisiSveKolaciceZaSadnjihSatVremena(int sat, int minut) {
		for (int i = 0; i < stranice.size(); i++) {
			if (sat >= this.stranice.get(i).getSat() && minut <= this.stranice.get(i).getMinut()) {
				this.stranice.get(i).obrisiKolacice();
			}
		}
	}
	public void print() {
		for (int i = 0; i < stranice.size(); i++) {
			this.stranice.get(i).stampaj();

		}
	}

}
