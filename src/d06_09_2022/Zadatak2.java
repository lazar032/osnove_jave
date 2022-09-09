package d06_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		PlaninarskiDom ovcarBanja = new PlaninarskiDom("Ovcar Banja", 1985);
		RekreativniPlaninar pera = new RekreativniPlaninar(132456, "Pera Peric", 20, "Cacak", 2000);
		RekreativniPlaninar lazar = new RekreativniPlaninar(1234, "Lazar Mitrovic", 35, "Cacak", 2500);
		Alpinista gago = new Alpinista(4321, "Dragan Mitrovic", 10);
		
		ovcarBanja.uclaniPlaninara(gago);
		ovcarBanja.uclaniPlaninara(lazar);
		ovcarBanja.uclaniPlaninara(pera);
		ovcarBanja.stampaj();
		ovcarBanja.mesecniPrihod();
	}

}
