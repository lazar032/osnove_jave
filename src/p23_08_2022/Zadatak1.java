package p23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Korisnik guest = new Korisnik("Pera Peric");
		Korisnik host = new Korisnik("Marko Markovic");
		ZoomCall zoomCall = new ZoomCall("https://sdeqwe.url", "PERA123", host);
		zoomCall.setGuest(guest);
		guest.pretplatiSe(100);
		zoomCall.print();
		
		

	}

}
