package pattern;
public abstract class Shape implements Cloneable{
	private String id;
	
	public abstract void draw();
	
	public abstract String getType();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}
