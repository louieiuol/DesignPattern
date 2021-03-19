package pattern;

public class Football extends Game{

	@Override
	public void initialize() {
		System.out.println("Football Game Initialized!");
	}

	@Override
	public void startPlay() {
		System.out.println("Football Game Started!");
	}

	@Override
	public void endPlay() {
		System.out.println("Football Game Finished!");
	}

}
