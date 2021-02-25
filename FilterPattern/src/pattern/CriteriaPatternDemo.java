package pattern;

import java.util.*;

public class CriteriaPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> input = new ArrayList<>();
		input.add(new Person("louie", "male", "single"));
		input.add(new Person("xingluo", "female", "single"));
		input.add(new Person("quan","female", "marriage"));
		input.add(new Person("qiang", "male", "marriage"));
		CriteriaFemale cf= new CriteriaFemale();
		CriteriaMale cm = new CriteriaMale();
		CriteriaSingle cs = new CriteriaSingle();
		AndCriteria ac1 = new AndCriteria(cs, cm);
		AndCriteria ac2 = new AndCriteria(cs, cf);
		OrCriteria oc = new OrCriteria(cf, cm);
		List<Person> ac1List = ac1.meetCriteria(input);
		System.out.println("ac1List: ");
		ac1List.forEach(p->System.out.println(p.toString()));
		List<Person> ac2List = ac2.meetCriteria(input);
		System.out.println("ac2List: ");
		ac2List.forEach(p->System.out.println(p.toString()));	
		List<Person> ocList = oc.meetCriteria(input); 
		System.out.println("ocList: ");
		ocList.forEach(p->System.out.println(p.toString()));	
	}

}
