package d18_08_2022;

public class FacebookPost {
	public String imeIPrezimeAktera;
	public String imeIPrezimeProfila;
	public String objava;
	public int lajkovi;
	public int deljenja;
	
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
		System.out.println(imeIPrezimeAktera + " >>>>> " + imeIPrezimeProfila);
		System.out.println(objava);
		System.out.println("Likes: " + lajkovi + " Shares: " + deljenja);
	}

}
