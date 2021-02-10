package videoPlayer2;

public class QualityOptimizerControl extends Control{
	
	private double brzinaInterneta;

	public QualityOptimizerControl(double brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		
		double kvalitet = this.brzinaInterneta * 10.1;
		
		if (kvalitet <= 144) {
			video.setKvalitetVidea(144);
		} else if (kvalitet <= 240) {
			video.setKvalitetVidea(240);
		} else if (kvalitet <= 360) {
			video.setKvalitetVidea(360);
		} else if (kvalitet <= 480) {
			video.setKvalitetVidea(480);
		} else if (kvalitet <= 720) {
			video.setKvalitetVidea(720);
		} else {
			video.setKvalitetVidea(1080);
		}
		
	}
	
	
	
	
	
	

}
