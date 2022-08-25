package d23_08_2022;

public class ZeleniKarton {
	private String imeIPrezime;
	private String brIndexa;
	private String nazivPredmeta;
	private String profesor;
	private int ocena;
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ZeleniKarton(String imeIPrezime, String brIndexa, String nazivPredmeta,
			String profesor, int ocena) {
		this.imeIPrezime = imeIPrezime;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.profesor = profesor;
		this.ocena = ocena;
	}
	
	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		} else return false;
	}
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezime + ", " + this.brIndexa);
		System.out.println("Profesor: " + this.profesor);
	}

}
