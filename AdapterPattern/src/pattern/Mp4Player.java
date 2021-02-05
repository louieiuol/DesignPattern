package pattern;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVLC(String fileName) {}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play Mp4" + fileName);
	}

}
