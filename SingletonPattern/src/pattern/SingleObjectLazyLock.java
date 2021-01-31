package pattern;


//是lazy初始化
//是线程安全
//效率很低


public class SingleObjectLazyLock {
	private static SingleObjectLazyLock instance;
	private static int count;
	private SingleObjectLazyLock() {}
	public static synchronized SingleObjectLazyLock getInstance(){
		if(instance == null) {
			instance = new SingleObjectLazyLock();
			count = 0;
		}
		return instance;
	}
	
	public static void getMessage() {
		System.out.print("count is: "+ count++);
	}
}
