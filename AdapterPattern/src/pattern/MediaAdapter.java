package pattern;

public class MediaAdapter implements MediaPlayer{
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VLCPlayer();
		}
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVLC(fileName);
		}
		if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
