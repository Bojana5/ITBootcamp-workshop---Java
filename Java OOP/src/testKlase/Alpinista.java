package testKlase;

public class Alpinista extends Planinar{
	
	private int poeni;
	
	public Alpinista(int id, String ime, String prezime, int poeni) {
		super(id, ime, prezime);
		this.poeni = poeni;
	}
	public int getPoeni() {
		return poeni;
	}
	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	//placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50
	@Override
	public double clanarina() {
	
		return 1500 - this.poeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() < 4000) {
			return true;
		}
		return false;
	}

	@Override
	public void stampaj() {
		
		System.out.println("Alpinista, id: " + super.getId());
		System.out.println("ime: " + super.getIme() + " " + super.getPrezime());
		System.out.println("Broj poena: " + this.poeni);
		
	}
	
	
	
	

}

/*
 Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
 Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) 
 i poeni se mogu menjati (znaci, postojace seter). Napraviti konstruktor. 
 
 Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
  a informacije o alpinisti se ispisuju u formatu: 
Alpinista, id: id
ime: ime i prezime 
Broj poena: poeni 
 */

