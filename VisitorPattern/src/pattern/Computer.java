package pattern;

public class Computer implements ComputerPart {
	
	private ComputerPart[] parts;

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(ComputerPart part: parts) {
			part.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
	
	public Computer() {
		parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}

}
