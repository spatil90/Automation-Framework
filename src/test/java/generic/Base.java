package generic;


import java.util.*;

import junit.framework.Assert;

public class Base {
	
	public void compareValue(Object actualvalue, Object expectedvalue) {
     Assert.assertEquals(expectedvalue, actualvalue);
     
	}

	
	public void learningCollection() {
		List<String> ll;
		ll = new ArrayList<String>();
		ll.add("sdfjb");
		ll.add("5461");
		ll.add("nknk");
		
		ll = new LinkedList();
		
		ll = new Vector();
		Set ss;
		ss = new HashSet();
		ss = new LinkedHashSet();
		ss = new TreeSet();
		Map mm;
		mm = new HashMap();
		mm = new LinkedHashMap();
		mm = new TreeMap();
		
		TreeMap hh = new TreeMap();		
	}
}
