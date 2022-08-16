package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		SmartAirConditioning s = new SmartAirConditioning();
		s.proizvodjac = "Samsung";
		s.mod = "Hladi";
		s.temperatura = 15;
		s.stampaj();
		s.spoljnaTemp(20);
	}

}
