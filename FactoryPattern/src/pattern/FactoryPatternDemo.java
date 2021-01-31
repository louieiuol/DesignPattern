package pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.getShape("Circle");
		Shape square = sf.getShape("Square");
		Shape rectangle = sf.getShape("Rectangle");
		circle.draw();
		square.draw();
		rectangle.draw();
	}

}
