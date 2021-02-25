package pattern;

import java.util.*;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> raw) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaPerson = criteria.meetCriteria(raw);
		return otherCriteria.meetCriteria(firstCriteriaPerson);
	}

}
