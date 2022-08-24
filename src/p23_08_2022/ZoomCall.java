package p23_08_2022;

public class ZoomCall {
	private String linkPoziva;
	private String password;
	private Korisnik guest;
	private Korisnik host;
	
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLinkPoziva() {
		return linkPoziva;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	public ZoomCall(String linkPoziva, String password, Korisnik host) {
		this.linkPoziva = linkPoziva;
		this.password = password;
		this.host = host;
	}
	
	
	public void print() {
		System.out.println("ZoomCall: " + linkPoziva);
		System.out.println("Password: " + password);
		System.out.println("Host: " + this.host.getImeIPrezime());
		System.out.println("Korisnik: " + this.guest.getImeIPrezime());
		System.out.println("Maksimalno trajanje poziva je " + this.guest.maxTrajanjePoziva());
	}
	
	

}
