package pattern;


//是lazy初始化 
//否多线程安全
//没有加锁, 不能多线程


public class SingleObjectLazy {
	private static SingleObjectLazy instance;
	private static int count;
	private SingleObjectLazy() {};
	public static SingleObjectLazy getInstance() {
		if(instance == null) {
			instance = new SingleObjectLazy();
			count = 0;
		}
		return instance;
	}
	
	public static void getMessage() {
		System.out.print("count is: "+ count++);
	}
}
