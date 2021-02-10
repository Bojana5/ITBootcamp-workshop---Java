package zadatak;

public class Sastojak {
	
	private String naziv;
	private int kolicina;
	private double cena;
	
	public Sastojak(String naziv, int kolicina, double cena) {
		super();
		this.naziv = naziv;
		this.kolicina = kolicina;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public double izracunajUkupnuCenu() {
		
		return this.cena * this.kolicina;
		
	}
	
	public void stampaj() {
		
		System.out.println("(" + this.naziv + "), (" + this.cena + " din.)");
	}
	

}
