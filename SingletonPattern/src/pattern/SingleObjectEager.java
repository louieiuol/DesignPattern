package pattern;


//否支持lazy初始化
//是多线程安全
//没有加锁执行效率高, 类加载初始化, 浪费内存
public class SingleObjectEager {
	private static SingleObjectEager instance= new SingleObjectEager();
	private static int count = 0;
	private SingleObjectEager() {};
	
	public static SingleObjectEager getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.print("count is: "+ count++);
	}
}
