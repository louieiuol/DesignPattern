package pattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		SellStock sellStock = new SellStock(stock);
		BuyStock buyStock  = new BuyStock(stock);
		Broket broket = new Broket();
		broket.takeOrder(buyStock);
		broket.takeOrder(buyStock);
		broket.placeOrders();
		broket.takeOrder(sellStock);
		broket.takeOrder(buyStock);
		broket.placeOrders();
	}
	
}
