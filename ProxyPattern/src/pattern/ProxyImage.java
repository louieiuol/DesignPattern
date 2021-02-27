package pattern;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if(realImage == null) {
			//不会重复创建新的realImage
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
