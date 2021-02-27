package pattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		RedShapeDecorator rsd1 = new RedShapeDecorator(c);
		c.draw();
		rsd1.draw();
		RedShapeDecorator rsd2 = new RedShapeDecorator(r);
		r.draw();
		rsd2.draw();
	}

}
