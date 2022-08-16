package p16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		SlackMessage info1 = new SlackMessage();
		info1.imeOsobe = "Pera Peric";
		info1.datumIVreme = "16.08.2022. 19:53";
		info1.poruka = "Kako se zove Brazilac u zatvoru?";
		info1.stampaj();
		
		SlackMessage info2 = new SlackMessage();
		info2.imeOsobe = "Neda Nedic";
		info2.datumIVreme = "16.08.2022. 19:55";
		info2.poruka = "Robinjo.";
		info2.stampaj();
		
//		System.out.println(info1.imeOsobe + " - " + info1.datumIVreme);
//		System.out.println(info1.poruka);
//		
//		System.out.println(info2.imeOsobe + " - " + info2.datumIVreme);
//		System.out.println(info2.poruka);
		

	}

}
