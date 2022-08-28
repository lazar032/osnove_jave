package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private String brojIndexa;
	private String imeIPrezime;
	private String tipStudija;
	ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	public Student(String brojIndexa, String imeIPrezime, String tipStudija) {
		super();
		this.brojIndexa = brojIndexa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}
	public String getBrojIndexa() {
		return brojIndexa;
	}
	public void setBrojIndexa(String brojIndexa) {
		this.brojIndexa = brojIndexa;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	 public void dodajIspit(Ispit ispit) {
		 ispiti.add(ispit);
	 }
	 
	 public void stampaj() {
		 System.out.println(brojIndexa + " - " + imeIPrezime + " - " + tipStudija);
		 System.out.println("Predmeti: ");
		 for (int i = 0; i < ispiti.size(); i++) {
			 this.ispiti.get(i).stampajIspit();
		 }
	 }

}
