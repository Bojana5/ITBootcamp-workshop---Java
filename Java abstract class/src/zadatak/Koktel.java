package zadatak;

public class Koktel extends Pice{
	
	

	public Koktel(String naziv) {
		super(naziv);
	}

	@Override
	public double ukupnaCenaPica() {
		
		return super.ukupnaCenaSastojaka() + (super.ukupnaCenaSastojaka() * 0.9);
	}

	@Override
	public void stampaj() {
		
		System.out.println("(" + getNaziv() + ") ---- (" + this.ukupnaCenaPica() + " din.)");
		for (int i = 0; i < super.getNizSastojaka().length; i++) {
			if (super.getNizSastojaka()[i] != null) {
				super.getNizSastojaka()[i].stampaj();
			} else {
				break;
			}
			
		}
	}

}
