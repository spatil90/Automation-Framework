package generic;

import junit.framework.Assert;

public class Base {
	public void compareValue(Object actualvalue, Object expectedvalue) {
     Assert.assertEquals(expectedvalue, actualvalue);
     
	}

}
