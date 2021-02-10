package testKlase;

public abstract class Planinar {
	
	private int id;
	private String ime;
	private String prezime;
	
	public Planinar(int id, String ime, String prezime) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	public abstract double clanarina();
	
	public abstract boolean uspesanUspon(Planina planina);
	
	public abstract void stampaj();
}

/*
 Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
jedinstveni celobrojni identifikacioni broj
ime i prezime 
Dok od javnih metoda: 
konstruktor koji postavlja sve atribute klase. 
gettere 
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu.
 Metoda kao ulazni parametar prima objekat tipa Planina. 
 */


