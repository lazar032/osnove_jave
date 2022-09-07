package p05_09_2022;

public class StudentMaster extends Student {

	public StudentMaster(String imeIPrezime, String brojIndexa, int godStudija) {
		super(imeIPrezime, brojIndexa, godStudija);
	}

	@Override
	public int skolarina() {
		return 100000;
	}

	@Override
	public String budzet() {
		if (super.godStudija <= 2) {
			return "Budzet";
		} else {
			return "Samofinansiranje";
		}
	}

}
