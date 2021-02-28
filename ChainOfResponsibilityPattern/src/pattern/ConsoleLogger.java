package pattern;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Console Logger 1: "+ msg);
	}

}
