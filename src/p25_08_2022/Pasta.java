package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
	ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
	
	public void dodajSastojak(Sastojak sastojak) {
		this.sastojci.add(sastojak);
	}
	
	public Pasta() {
		
	}
	

	
	public int cenaPaste() {
		int cenaPaste = 0;
		for (int i = 0; i < this.sastojci.size(); i++) {
			cenaPaste = cenaPaste + this.sastojci.get(i).getCena();
		}
		return cenaPaste;
		
	}
	
	public void stampaj() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < this.sastojci.size(); i++) {
			System.out.println(this.sastojci.get(i).getNaziv() + " " + 
					this.sastojci.get(i).getCena() + " din.");
		}
		System.out.println("Cena paste je: " + this.cenaPaste() + " din.");
	}
	
	public void brisiSastojak(String sastojak) {
		for (int i = 0; i < this.sastojci.size(); i++) {
			if (this.sastojci.get(i).getNaziv().equals(sastojak)) {
				sastojci.remove(i);
			}
		}
	}
}
