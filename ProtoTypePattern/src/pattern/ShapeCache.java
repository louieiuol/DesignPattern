package pattern;
import java.util.*;

class ShapeCache {
	private Map<String, Shape> shapeMap;
	public ShapeCache() {
		shapeMap = new HashMap<>();
	}
	
	public Shape getShape(String id) {
		Shape shape = shapeMap.get(id);
		return (Shape) shape.clone();
	}
	
	public void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
	
}
