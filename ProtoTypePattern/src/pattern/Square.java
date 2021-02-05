package pattern;
public class Square extends Shape{

	private String type;
	
	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square:: draw() method");
	}

	@Override
	public String getType() {
		return type;
	}
	
}
