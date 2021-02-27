package pattern;

import java.util.*;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		this.name = name; 
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}
	
	public void add(Employee employee) {
		this.subordinates.add(employee);
	}
	
	public void remove(Employee employee){
		this.subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates(){
		return this.subordinates;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: "+ this.name + ", dept: " + this.dept + ", salary: "+ this.salary);
		sb.append("\n");
		for(Employee e: this.subordinates) {
			sb.append(e.toString());
		}
		return sb.toString();
	}
	
}
