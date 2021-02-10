package testKlase;

public class RekreativniPlaninar extends Planinar{
	
	private int tezinaOpreme;
	private String okrug;
	private int maxUspon;

	public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maxUspon) {
		super(id, ime, prezime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maxUspon = maxUspon;
	}
	
	public int getTezinaOpreme() {
		return tezinaOpreme;
	}
	public String getOkrug() {
		return okrug;
	}
	public int getMaxUspon() {
		return maxUspon;
	}


	@Override
	public double clanarina() {
		
		return 1000;
	}

	//da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, 
	//s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
	@Override
	public boolean uspesanUspon(Planina planina) {
		
		this.maxUspon = this.maxUspon - this.tezinaOpreme * 50;

		if (this.maxUspon < planina.getVisinaPlanine()) {
			return false;
		}
		return true;
		
	}
	
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + super.getId());
		System.out.println("ime: " + super.getIme() + " " + super.getPrezime() + " Okrug: " + this.okrug);
		
	}

}

/*
 Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. 
 Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru (znaci, nemaju setere): 
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
naziv okruga odakle je rekreativni planinar. 
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
napraviti konstruktor
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, 
s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
Rekreativac, id: id
 ime: ime prezime Okrug: okrug 
 */



