package d22_08_2022;

public class Knjiga {
	private String isbn;
	private String naziv;
	private int godIzdavanja;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int godIzdavanja) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godIzdavanja = godIzdavanja;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodIzdavanja() {
		return godIzdavanja;
	}

	public void setGodIzdavanja(int godIzdavanja) {
		this.godIzdavanja = godIzdavanja;
	}

	
	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godIzdavanja);
		System.out.println("Autor: ");
		this.autor.stampaj();
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	

}
