
package pattern;
public class Circle extends Shape {
	
	private String type;
	
	public Circle() {
		this.type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method");
	}

	@Override
	public String getType() {
		return this.type;
	}
	
}
