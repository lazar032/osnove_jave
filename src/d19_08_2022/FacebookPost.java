package d19_08_2022;

public class FacebookPost {
	private String imeIPrezimeAktera;
	private String imeIPrezimeProfila;
	private String objava;
	private int lajkovi;
	private int deljenja;
	
	public void setImeIPrezimeAktera (String imeIPrezimeAktera) {
		this.imeIPrezimeAktera = imeIPrezimeAktera;
	}
	public void setImeIPrezimeProfila (String imeIPrezimeProfila) {
		this.imeIPrezimeProfila = imeIPrezimeProfila;
	}
	public void setObjava(String objava) {
		this.objava = objava;
	}
	public void setLajkovi(int lajkovi) {
		this.lajkovi = lajkovi;
	}
	public void setDeljenja(int deljenja) {
		this.deljenja = deljenja;
	}
	public String getImeIPrezimeAktera () {
		return imeIPrezimeAktera;
	}
	public String getImeIPrezimeProfila () {
		return imeIPrezimeProfila;
	}
	public String getObjava() {
		return objava;
	}
	public int getLajkovi() {
		return lajkovi;
	}
	public int getDeljenja() {
		return deljenja;
	}
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String iA, String iP, String o) {
		this.imeIPrezimeAktera = iA;
		this.imeIPrezimeProfila = iP;
		this.objava = o;
	}
	
	public void like() {
		this.lajkovi = this.lajkovi + 1;
	}
	public void dislike() {
		if (this.lajkovi > 0) {
			this.lajkovi = this.lajkovi - 1;
		}
	}
	public void share() {
		this.deljenja = this.deljenja + 1;
	}
	public void print() {
		System.out.println(this.imeIPrezimeAktera + " >>>>> " + this.imeIPrezimeProfila);
		System.out.println(this.objava);
		System.out.println("Likes: " + lajkovi + " Shares: " + deljenja);
	}
	

}
