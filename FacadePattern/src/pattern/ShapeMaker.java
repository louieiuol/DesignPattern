package pattern;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		this.circle.draw();
	}
	
	public void drawRectangle() {
		this.rectangle.draw();
	}
	
	public void drawSquare() {
		this.square.draw();
	}
}
