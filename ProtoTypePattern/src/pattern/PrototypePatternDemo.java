package pattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadCache();
		shapeCache.getShape("1").draw();
		shapeCache.getShape("2").draw();
		shapeCache.getShape("3").draw();
	}

}
