package pattern;

public class NameRepository implements Container {

	public String[] names = {"Robert", "John", "Julia"};
	
	@Override
	public MyIterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements MyIterator{
		int index;
		@Override
		public boolean hasNext(){
			if(index < names.length) return true;
			return false;
		}
		@Override
		public Object next() {
			if(this.hasNext()) return names[index++];
			return null;
		}
	}
}
