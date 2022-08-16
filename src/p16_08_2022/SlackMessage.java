package p16_08_2022;

public class SlackMessage {
	public String poruka;
	public String imeOsobe;
	public String datumIVreme;
	
	public void stampaj() {
		System.out.println(this.imeOsobe + " - " + this.datumIVreme);
		System.out.println(this.poruka);
	}
}

