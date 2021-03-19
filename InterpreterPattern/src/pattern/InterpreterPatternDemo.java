package pattern;

public class InterpreterPatternDemo {

	//规则: robert, john是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedWomenExpression() {
		Expression julia = new TerminalExpression("Julia");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julia, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomenExpression();
		System.out.println("John is male? "+ isMale.interpret("John"));
		System.out.println("Julia is a married women? " + isMarriedWoman.interpret("Married Julia"));
	}
	
}
