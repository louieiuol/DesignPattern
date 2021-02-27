package pattern;


//当被请求时候, 使用ProxyImage 来获取RealImage类的对象
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test.png");
		image.display();
		//第二次图像不需要从磁盘加载
		image.display();
	}
}
