package pattern;


import java.util.*;

public class Broket {
	private static final List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrders() {
		for(Order order: orders) {
			order.execute();
		}
		orders.clear();
	}
}
