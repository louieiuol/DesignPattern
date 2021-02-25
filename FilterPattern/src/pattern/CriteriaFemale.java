package pattern;

import java.util.*;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> raw) {
		// TODO Auto-generated method stub
		List<Person> result = new ArrayList<>();
		for(Person p: raw) {
			if(p.getGender().equals("female")) {
				result.add(p);
			}
		}
		return result;
	}
	
}
