package videoPlayer2;

public class TimeControl extends Control{
	
	private boolean pomeranjeVremena;
	

	public TimeControl(boolean pomeranjeVremena) {
		super();
		this.pomeranjeVremena = pomeranjeVremena;
	}
	
	public boolean isPomeranjeVremena() {
		return pomeranjeVremena;
	}
	public void setPomeranjeVremena(boolean pomeranjeVremena) {
		this.pomeranjeVremena = pomeranjeVremena;
	}


	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		
		double unapred;
		double unazad;
		
		if (this.pomeranjeVremena == true) {
			unapred = video.getVremeVidea() + 15;
			if (unapred <= video.getDuzinaVidea()) {
				video.setVremeVidea(unapred);
			}
		} else {
			unazad = video.getVremeVidea() - 15;
			if (unazad >= video.getDuzinaVidea()) {
				video.setVremeVidea(unazad);
			}	
		}
		
	}

}
