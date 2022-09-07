package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		Figura t1 = new JednakostranicniTrougao(3);
		Figura t2 = new JednakostranicniTrougao(5);
		Figura p1 = new Pravougaonik(2, 4);
		Figura p2 = new Pravougaonik(3, 5);
		Figura p3 = new Pravougaonik(1, 4);
		ArrayList<Figura> figure = new ArrayList<Figura>();
		figure.add(t1);
		figure.add(t2);
		figure.add(p1);
		figure.add(p2);
		figure.add(p3);
		double zbirObima = 0;
		double zbirPovrsina = 0;
		
		for (int i = 0; i < figure.size(); i++) {
			zbirObima = zbirObima + figure.get(i).obim();
			zbirPovrsina = zbirPovrsina + figure.get(i).povrsina();
			figure.get(i).stampaj();
		}
		
		

	}

}
