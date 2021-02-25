package pattern;

public class Person {
	String name;
	String gender;
	String status; 
	
	public Person(String name, String gender, String status) {
		this.name = name;
		this.gender = gender;
		this.status = status;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	@Override 
	public String toString() {
		return "name: "+ this.name + ", gender: " + this.gender + ", status: " + this.status;
	}
}
