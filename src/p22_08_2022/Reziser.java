package p22_08_2022;

public class Reziser {
	private String imeIPrezime;
	private int starost;
	
	public Reziser(String imeIPrezime, int starost) {
		this.imeIPrezime = imeIPrezime;
		this.starost = starost;
	}
	
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public int getStarost() {
		return starost;
	}
	public void print() {
		System.out.println(this.imeIPrezime + ", " + this.starost + "god");
	}

}
