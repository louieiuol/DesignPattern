package pattern;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Cricket Game Initialized!");
	}

	@Override
	public void startPlay() {
		System.out.println("Cricket Game Started!");
	}

	@Override
	public void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

}
