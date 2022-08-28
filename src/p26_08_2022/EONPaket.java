package p26_08_2022;

public class EONPaket extends Paket {

	public EONPaket(String imeIPrezime, int cenaMesec, int ugovorObaveza) {
		super("EON LIGHT DUO", imeIPrezime, cenaMesec, ugovorObaveza, 150, 75);
	}
	@Override
	public int poDinar() {
		return 3;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print(" - " + super.poDinar());
	}

}
