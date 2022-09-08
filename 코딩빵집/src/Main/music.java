package Main;

import javazoom.jl.player.MP3Player;

public class music {

	

	public static void m2() {
		MP3Player mp3 = new MP3Player();
		mp3.play(".//music//빙고완료.mp3");
	}

	public static void m3() {
		MP3Player mp3 = new MP3Player();
		mp3.play(".//music//정답.mp3");

	}
	public static void m4() {
		MP3Player mp3 = new MP3Player();
		mp3.play(".//music//오답.mp3");

	}
}
