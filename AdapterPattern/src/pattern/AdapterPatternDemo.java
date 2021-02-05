package pattern;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("vlc", "vlcFile");
		audioPlayer.play("mp3", "mp3File");
		audioPlayer.play("mp4", "mp4File");
	}
}
