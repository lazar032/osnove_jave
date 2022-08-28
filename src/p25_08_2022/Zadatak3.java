package p25_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		History istorija = new History();
		HistoryPage h1 = new HistoryPage("Facebook", "www.facebook.com", 20, 10);
		HistoryPage h2 = new HistoryPage("Youtube", "www.youtube.com", 20, 13);
		HistoryPage h3 = new HistoryPage("Eon", "www.eon.com", 20, 23);
		HistoryPage h4 = new HistoryPage("Formula 1", "www.f1.com", 20, 36);
		HistoryPage h5 = new HistoryPage("Instagram", "www.instagram.com", 21, 15);
		
		istorija.otvoriStranicu(h5);
		istorija.otvoriStranicu(h4);
		istorija.otvoriStranicu(h3);
		istorija.otvoriStranicu(h2);
		istorija.otvoriStranicu(h1);
		h4.sacuvajKredencijale("Username: sadad Password:123");
		h2.sacuvajKredencijale("Username: sda Pass: 123");
		h2.sacuvajKredencijale("Username: shrlida Pass: 131223");
		h2.sacuvajKredencijale("Username: sasdfda Pass: 122133");
		h2.sacuvajKredencijale("Username: p[oimsda Pass: 123133");
		istorija.obrisiKolaciceSaLinka("www.f1.com");
		
		istorija.obrisiSveKolaciceZaSadnjihSatVremena(20, 40);
		istorija.print();

	}

}
