package pattern;

public class ColorFactory extends AbstractFactory{

	private Color color;
	
	@Override
	public Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		if(colorName.equals("Red")) {
			color = new Red();
		}else if(colorName.equals("Green")) {
			color = new Green();
		}else if(colorName.equals("Blue")) {
			color = new Blue();
		}
		return color;
	}

}
