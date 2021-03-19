package pattern;

public class FactoryProducer {

	public AbstractFactory getFactory(String factoryName) {
		AbstractFactory factory = null;
		if(factoryName.equals("Shape")) {
			factory = new ShapeFactory();
		}else if(factoryName.equals("Color")) {
			factory = new ColorFactory();
		}
		return factory;
	}
	
}
