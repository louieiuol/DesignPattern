package pattern;

public class ChainPatternDemo {
	
	
	private static AbstractLogger getChainOfLoggers() {
		//设定每个Logger级别
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		//Logger顺序: errorLogger -> fileLogger -> consoleLogger
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger al = getChainOfLoggers();
		al.logMessage(AbstractLogger.INFO, "This is an info");
		al.logMessage(AbstractLogger.DEBUG, "This is an file");
		al.logMessage(AbstractLogger.ERROR, "This is an error");
	}

}
