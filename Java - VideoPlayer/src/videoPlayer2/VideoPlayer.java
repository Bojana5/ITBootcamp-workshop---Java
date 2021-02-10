package videoPlayer2;

public class VideoPlayer {
	
	private double duzinaVidea;
	private double vremeVidea;
	private int jacinaZvuka;
	private double kvalitetVidea;
	
	public VideoPlayer(double duzinaVidea, double vremeVidea, int jacinaZvuka, double kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.vremeVidea = vremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public double getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public double getVremeVidea() {
		return vremeVidea;
	}

	public void setVremeVidea(double vremeVidea) {
		this.vremeVidea = vremeVidea;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public double getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(double kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampaj() {
		System.out.println("trenutno vreme videa: " + this.vremeVidea);
		System.out.println("jacina zvuka: " + this.jacinaZvuka);
		System.out.println("kavlitet videa: " + this.kvalitetVidea);
	}
	
	

}
