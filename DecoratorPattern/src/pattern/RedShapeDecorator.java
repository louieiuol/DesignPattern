package pattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedshape) {
		super(decoratedshape);
	}
	

	@Override
	public void draw() {
		this.decoratedShape.draw();
		setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("set red border");
	}

}
