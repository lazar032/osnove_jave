package d16_08_2022;

public class SmartAirConditioning {
	public String proizvodjac;
	public double temperatura;
	public String mod;

	public void stampaj() {
		System.out.println(proizvodjac + ", " + temperatura + ", " + mod);
		
	}
	
	public void spoljnaTemp(int spolja) {
		if (spolja > temperatura) {
			System.out.println("Napolju je veca temperatura");
		} else {
			System.out.println("Unutra je veca temperatura");
		}
	} 

}
