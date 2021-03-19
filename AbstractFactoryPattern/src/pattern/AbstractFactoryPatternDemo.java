package pattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory shapeFactory = fp.getFactory("Shape");
		AbstractFactory colorFactory = fp.getFactory("Color");
		Shape circle = shapeFactory.getShape("Circle");
		Color blue = colorFactory.getColor("Blue");
		circle.draw();
		blue.fill();
	}

}
