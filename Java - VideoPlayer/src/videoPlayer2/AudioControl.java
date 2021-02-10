package videoPlayer2;

public class AudioControl extends Control{
	
	private boolean pojacaj;

	public AudioControl(boolean pojacaj) {
		super();
		this.pojacaj = pojacaj;
	}

	public boolean isPojacaj() {
		return pojacaj;
	}
	public void setPojacaj(boolean pojacaj) {
		this.pojacaj = pojacaj;
	}

	
	@Override
	public void izvrsiAkciju(VideoPlayer video) {
		
		int pojacaj;
		int smanji;
		
		if (this.pojacaj == true) {
			pojacaj = video.getJacinaZvuka() + 1;
			if (pojacaj >=0 && pojacaj <=100) {
				video.setJacinaZvuka(pojacaj);
			}	
		} else {
			smanji = video.getJacinaZvuka() - 1;
			if (smanji >=0 && smanji <=100) {
				video.setJacinaZvuka(smanji);
			}	
		}
		
	}
	
	

}
