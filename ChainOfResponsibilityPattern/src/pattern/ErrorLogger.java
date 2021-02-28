package pattern;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error Logger 3: "+ msg);
	}

}
