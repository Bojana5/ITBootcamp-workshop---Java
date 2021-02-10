package videoPlayer;

public class PlayerMain {

	public static void main(String[] args) {
		
		VideoPlayer player = new VideoPlayer(3, 200, 144, 70);
		
		Control c1 = new AudioControl(true);
		Control c2 = new AudioControl(false);
		Control c3 = new QualityOptimizerControl(50);
		Control c4 = new TimeControl(true);
		Control c5 = new TimeControl(false);
		
		Control[] nizKontrola = new Control[5];
		nizKontrola[0] = c1;
		nizKontrola[1] = c2;
		nizKontrola[2] = c3;
		nizKontrola[3] = c4;
		nizKontrola[4] = c5;
		
		for (int i = 0; i < nizKontrola.length; i++) {
			nizKontrola[i].izvrsiAkciju(player);
			player.stampaj();
		}
	}

}
