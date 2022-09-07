package p05_09_2022;

public abstract class Figura {
	public abstract double obim();
	
	public abstract double povrsina();
	
	public void stampaj() {
		System.out.println("Povrsina je: " + this.povrsina());
		System.out.println("Obim je: " + this.obim());
	}

}
