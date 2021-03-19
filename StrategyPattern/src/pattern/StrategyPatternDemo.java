package pattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Strategy addStrategy = new OperationAdd();
		Strategy substractStrategy = new OperationSubstract();
		Strategy multiplyStrategy = new OperationMultiply();
		Context context = new Context(addStrategy);
		System.out.println("1 + 1 = "+ context.executeStrategy(1, 1));
		context.setStrategy(substractStrategy);
		System.out.println("1 - 1 = "+ context.executeStrategy(1, 1));
		context.setStrategy(multiplyStrategy);
		System.out.println("1 * 1 = "+ context.executeStrategy(1, 1));
	}

}
