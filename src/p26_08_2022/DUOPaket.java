package p26_08_2022;

public class DUOPaket extends Paket{
	@Override
	public int poDinar() {
		return 6;
	}

	public DUOPaket(String imeIPrezime, int cenaMesec, int ugovorObaveza) {
		super("EON FULL DUO", imeIPrezime, cenaMesec, ugovorObaveza, 250, 100);
	}
	
	public String dodatniUredjaj(String uredjaj) {
		return uredjaj;
	}
	public void povecanjeBrzine(int povecanjeDown, int povecanjeUp) {
		super.downloadSpeed += povecanjeDown;
		super.uploadSpeed += povecanjeUp;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print(" - " + super.poDinar());
	}
	

}
