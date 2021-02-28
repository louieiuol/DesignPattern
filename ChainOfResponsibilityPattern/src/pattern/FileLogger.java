package pattern;

public class FileLogger extends AbstractLogger{

	public FileLogger(int level) {
		this.level = level;
	}
	
	@Override
	public void write(String msg) {
		System.out.println("File Logger 2: "+ msg);
	}

}
