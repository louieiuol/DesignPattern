package pattern;

public class ShapeFactory extends AbstractFactory {
	private Shape shape;
	
	@Override
	public Shape getShape(String shapeName) {
		if(shapeName.equals("Circle")) {
			shape = (Shape) new Circle();
		}else if(shapeName.equals("Square")) {
			shape = (Shape) new Square();
		}else if(shapeName.equals("Rectangle")) {
			shape = (Shape) new Rectangle();
		}
		return shape;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
