package pattern;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if(shape == null) return null;
		if(shape.equals("Circle")) return new Circle();
		if(shape.equals("Square")) return new Square();
		if(shape.equals("Rectangle")) return new Rectangle();
		return null;
	}
}
