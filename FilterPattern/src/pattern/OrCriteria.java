package pattern;

import java.util.*;

public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> raw) {
		// TODO Auto-generated method stub
		List<Person> firstCriteria = criteria.meetCriteria(raw);
		List<Person> secondCriteria = otherCriteria.meetCriteria(raw);
		for(Person p: secondCriteria) {
			if(!firstCriteria.contains(p)) {
				firstCriteria.add(p);
			}
		}
		return firstCriteria;
	}
	
}
