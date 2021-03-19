package pattern;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println("Time: " + new Date().toString() + ", Name: "+ user.getName() +" , Msg: " + message);
	}
}
