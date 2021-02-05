package pattern;

public class Circle extends Shape {
	
	private String type;
	
	public Circle() {
		this.type = "Circle";
	}
	
	public void draw() {
		System.out.println("Inside Circle:: draw() method");
	}

	public String getType() {
		return this.type;
	}
	
}
