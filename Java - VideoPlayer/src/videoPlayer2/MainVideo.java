package videoPlayer2;

public class MainVideo {

	public static void main(String[] args) {
		
		VideoPlayer video = new VideoPlayer(190, 15.5, 5, 240);
		
		TimeControl vreme1 = new TimeControl(true);
		TimeControl vreme2 = new TimeControl(false);
		AudioControl zvuk1 = new AudioControl(true);
		AudioControl zvuk2 = new AudioControl(false);
		QualityOptimizerControl kvalitet1 = new QualityOptimizerControl(150);
		QualityOptimizerControl kvalitet2 = new QualityOptimizerControl(5);
		
		video.stampaj();
		System.out.println();
		vreme1.izvrsiAkciju(video);
		video.stampaj();
		System.out.println();
		zvuk2.izvrsiAkciju(video);
		video.stampaj();
		System.out.println();
		kvalitet1.izvrsiAkciju(video);
		video.stampaj();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("         sve akcije nad video player-om");
		System.out.println("-----------------------------------------------------------------------");
		
		Control[] niz = {vreme1, vreme2, zvuk1, zvuk2, kvalitet1, kvalitet2};
		
		for (int i = 0; i < niz.length; i++) {
			niz[i].izvrsiAkciju(video);
			video.stampaj();
			System.out.println("-----------------------------------------------------------------------");
			System.out.println();
		}

	}

}
