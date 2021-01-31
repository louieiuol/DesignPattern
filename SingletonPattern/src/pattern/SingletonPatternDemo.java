package pattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObjectEager spe = SingleObjectEager.getInstance();
		spe.showMessage();
		spe.showMessage();
		spe.showMessage();
		SingleObjectLazy spl = SingleObjectLazy.getInstance();
		SingleObjectLazyLock spll = SingleObjectLazyLock.getInstance();
		SingleObjectDCL spdcl = SingleObjectDCL.getInstance();
	}

}
