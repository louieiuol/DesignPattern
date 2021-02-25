package pattern;

import java.util.*;

public interface Criteria {
	List<Person> meetCriteria(List<Person> raw);
}
