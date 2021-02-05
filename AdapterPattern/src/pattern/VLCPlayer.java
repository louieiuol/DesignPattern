package pattern;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("play VLC"+ fileName);
		
	}

	@Override
	public void playMp4(String fileName) {}

}
