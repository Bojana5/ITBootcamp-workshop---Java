package videoPlayer;

public class VideoPlayer {
	private int trenutnoVreme;
	private int duzinaVidea;
	private int kvalitet;
	private int jacinaZvuka;
	
	public VideoPlayer() {
	}
	
	public VideoPlayer(int trenutnoVreme, int duzinaVidea, int kvalitet, int jacinaZvuka) {
		this.trenutnoVreme = trenutnoVreme;
		this.duzinaVidea = duzinaVidea;
		this.kvalitet = kvalitet;
		this.jacinaZvuka = jacinaZvuka;
	}
	
	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public int getKvalitet() {
		return kvalitet;
	}
	public void setKvalitet(int kvalitet) {
		this.kvalitet = kvalitet;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	
	public void stampaj() {
		System.out.println("Trenutno vreme je:  " + this.trenutnoVreme + "s");
		System.out.println("Trenutna jacina zvuka je: " + this.jacinaZvuka);
		System.out.println("Trenutni kvalitet je " + this.kvalitet);
		System.out.println("***************************************************");
	}
}
