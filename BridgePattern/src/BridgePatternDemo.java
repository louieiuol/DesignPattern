
public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedCircle redCircle = new RedCircle();
		GreenCircle greenCircle = new GreenCircle();
		Circle circle1 = new Circle(redCircle, 1, 2, 3);
		Circle circle2 = new Circle(greenCircle, 1, 2, 3);
		circle1.draw();
		circle2.draw();
	}

}
