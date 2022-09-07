package p05_09_2022;

public class StudentOsnovnih extends Student {

	public StudentOsnovnih(String imeIPrezime, String brojIndexa, int godStudija) {
		super(imeIPrezime, brojIndexa, godStudija);
	}

	@Override
	public int skolarina() {
		return 90000;
	}

	@Override
	public String budzet() {
		if (super.godStudija <= 5) {
			return "Budzet";
		} else {
			return "Samofinansiranje";
		}
	}

}
