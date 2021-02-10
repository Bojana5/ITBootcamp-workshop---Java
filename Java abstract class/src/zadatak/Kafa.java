package zadatak;

public class Kafa extends Pice{
	
	private int procenatKofeina;

	public Kafa(String naziv, int procenatKofeina) {
		super(naziv);
		this.procenatKofeina = procenatKofeina;
	}
	
	public int getKolicinaKofeina() {
		return procenatKofeina;
	}
	public void setKolicinaKofeina(int procenatKofeina) {
		this.procenatKofeina = procenatKofeina;
	}


	@Override
	public double ukupnaCenaPica() {
		
	//	(procenat kofeina) * 30 + (cena svih sastojaka)
		return this.procenatKofeina * 30 + super.ukupnaCenaSastojaka();
	}

	@Override
	public void stampaj() {
		
		System.out.println("(" + super.getNaziv() + "), (" + this.procenatKofeina + ") --- (" + this.ukupnaCenaPica() + " din.)");
		for (int i = 0; i < super.getNizSastojaka().length; i++) {
			if (super.getNizSastojaka()[i] != null) {
				super.getNizSastojaka()[i].stampaj();
			} else {
				break;
			}
			
		}
	}

}
