package pattern;

import java.util.*;

public class Subject {
	private List<Observer> observers = new ArrayList<>();;
	private int state = 0;
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer ob) {
		observers.add(ob);
	}
	
	public void notifyAllObservers() {
		for(Observer ob: observers) {
			ob.update();
		}
	}
}
