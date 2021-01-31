package pattern;


//是lazy初始化
//是线程安全
//推荐方法


public class SingleObjectDCL {
	private volatile static SingleObjectDCL instance;
	private volatile static int count;
	private SingleObjectDCL() {}
	public static SingleObjectDCL getInstance() {
		if(instance  == null) {
			synchronized(SingleObjectDCL.class) {
				if(instance == null) {
					instance = new SingleObjectDCL();
					count =0;
					
				}
			}
		}
		return instance;
	}
	
	public static void getMessage() {
		System.out.print("count is: "+ count++);
	}
}
