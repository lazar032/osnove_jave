package p19_08_2022;

public class Tacka {
	private int x;
	private int y;

	public void stampaj() {
		System.out.println(this.x + " " + this.y);
	}

	public Tacka() {
		
	}
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

}
