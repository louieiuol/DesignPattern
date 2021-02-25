package pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> raw) {
		// TODO Auto-generated method stub
		List<Person> result = new ArrayList<>();
		for(Person p: raw) {
			if(p.getStatus().equals("single")) {
				result.add(p);
			}
		}
		return result;
	}

}
