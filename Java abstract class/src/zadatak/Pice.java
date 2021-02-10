package zadatak;

import zadatak.Sastojak;

public abstract class Pice {
	
	private String naziv;
	private Sastojak[] nizSastojaka;
	
	public Pice(String naziv) {
		super();
		this.naziv = naziv;
		this.nizSastojaka = new Sastojak[10];
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
	public Sastojak[] getNizSastojaka() {
		return nizSastojaka;
	}

	public void dodajSastojak (Sastojak sastojak) {
		
		for (int i = 0; i < this.nizSastojaka.length; i++) {
			if (this.nizSastojaka[i] == null) {
				this.nizSastojaka[i] = sastojak;
				break;
			}	
		}
	}
	
	public double ukupnaCenaSastojaka() {
		
		double zbir = 0;
		
		for (int i = 0; i < this.nizSastojaka.length; i++) {
			if (this.nizSastojaka[i] != null) {
				zbir = zbir + this.nizSastojaka[i].izracunajUkupnuCenu();
			}	
		}
		
		return zbir;
	}
	
	
	public abstract double ukupnaCenaPica();
	
	public abstract void stampaj();
	

}
