import java.util.*;

public class Meal {
	private List<Item> items;
	private float price;
	public Meal() {
		items = new ArrayList<>();
		price = 0;
	}
	
	public void addItem(Item item) {
		items.add(item);
		price += item.price();
	}
	
	public float price() {
		return price;
	}
	
	public void showItems() {
		for(Item item: items) {
			System.out.print("Item: "+ item.name());
			System.out.print(", Packing: "+ item.packing().pack());
			System.out.println(", Price: "+item.price() );
		}
	}
}
