package pattern;

import java.util.*;

public class CareTaker {
	private volatile static List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		if(mementoList == null) {
			synchronized(CareTaker.class) {
				if(mementoList == null) {
					mementoList = new ArrayList<>();
				}
			}
		}
		mementoList.add(memento);
	}
	
	public Memento get(int index) {
		if(mementoList == null) {
			synchronized(CareTaker.class) {
				if(mementoList == null) {
					mementoList = new ArrayList<>();
				}
			}
			return null;
		}else {
			return mementoList.get(index);
		}
	}
}
