package videoPlayer;

public class TimeControl extends Control {
	private boolean napred;
	
	public TimeControl(boolean napred) {
		this.napred = napred;
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int vreme = 0;
		
		if(this.napred) {
			vreme = player.getTrenutnoVreme() + 15;
		} else {
			vreme = player.getTrenutnoVreme() - 15;		
		}
		
		
		if(vreme  < 0) {
			vreme = 0;
		} else if (vreme > player.getDuzinaVidea()) {
			vreme = player.getDuzinaVidea();
		}
		
		player.setTrenutnoVreme(vreme);
	}

}
