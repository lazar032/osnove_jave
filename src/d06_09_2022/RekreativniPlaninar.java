package d06_09_2022;

public class RekreativniPlaninar extends Planinar{
	private int tezinaOpreme;
	private String okrugPoreklo;
	private int maxUspon;
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}
	public String getOkrugPoreklo() {
		return okrugPoreklo;
	}
	public int getMaxUspon() {
		return maxUspon;
	}
	public RekreativniPlaninar(int identifikacioniKod, String imeIPrezime, int tezinaOpreme, String okrugPoreklo,
			int maxUspon) {
		super(identifikacioniKod, imeIPrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrugPoreklo = okrugPoreklo;
		this.maxUspon = maxUspon;
	}
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id:" + super.identifikacioniKod);
		System.out.println("Ime: " + super.imeIPrezime);
		System.out.println("Okrug: " + this.okrugPoreklo);
		
	}
	@Override
	public int clanarina() {
		return 1000;
	}
	@Override
	public boolean uspesanUspon(Planina planina) {
		if (maxUspon > planina.getVisina()) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
