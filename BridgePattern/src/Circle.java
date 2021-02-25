
public class Circle extends Shape{
	int x;
	int y;
	int radius;
	
	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	} 
}
