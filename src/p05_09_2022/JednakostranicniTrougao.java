package p05_09_2022;

public class JednakostranicniTrougao extends Figura{
	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public JednakostranicniTrougao(double a) {
		super();
		this.a = a;
	}

	@Override
	public double obim() {
		return 3 * a;
	}

	@Override
	public double povrsina() {
		return (a * a) * 1.73205 / 4;
	}
	
	

}
