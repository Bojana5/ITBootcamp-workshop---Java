package videoPlayer;

public class QualityOptimizerControl extends Control {

	private double brzinaInterneta;
	
	public QualityOptimizerControl(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}
	
	private int racunajKvalitet()  {
		double a = brzinaInterneta * 10.1;
		if (a <= 144) {
			return 144;
		} else if (a <= 240) {
			return 240;
		}else if (a <= 360) {
			return 360;
		}else if (a <= 480) {
			return 480;
		}else if (a <= 720) {
			return 720;
		}else {
			return 1080;
		}
		
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int kvalitet = this.racunajKvalitet();
		player.setKvalitet(kvalitet);
	}
	
}
