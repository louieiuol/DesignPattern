package pattern;

public class Stock {
	private static final String name = "ABC";
	private static final int quantity = 10 ;
	
	public Stock() {
		
	}
	
	public void buy() {
		System.out.println("buy stock: "+ name + ", quantity: "+ quantity);
	}
	
	public void sell() {
		System.out.println("sell stock: "+ name+ ", quantity: "+ quantity);
	}
}
