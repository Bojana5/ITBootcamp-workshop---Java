package videoPlayer;

public class AudioControl extends Control {
	
	private boolean pojacaj;
	
	public AudioControl(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}
	
	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		int zvuk = 0;
		if(this.pojacaj) {
			zvuk = player.getJacinaZvuka() + 1;
		} else {
			zvuk = player.getJacinaZvuka() - 1;
		}
		
		if(zvuk < 0) {
			zvuk = 0;
		} else if (zvuk > 100) {
			zvuk = 100;
		}
		
		player.setJacinaZvuka(zvuk);
		
	}

}
