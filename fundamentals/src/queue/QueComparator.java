package queue;

import java.util.Comparator;

public class QueComparator implements Comparator {

	
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		return i2.compareTo(i1);
	}
	
	

}
