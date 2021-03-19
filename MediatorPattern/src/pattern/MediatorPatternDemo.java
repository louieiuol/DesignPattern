package pattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User user1 = new User("xiao");
		User user2 = new User("chen");
		User user3 = new User("quan");
		user1.sendMessage("hello");
		user2.sendMessage("hi");
		user3.sendMessage("hi too");
	}

}
