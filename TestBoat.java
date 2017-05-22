import static org.junit.Assert.*;

import org.junit.Test;

public class TestBoat {
	@Test
	public void testGettersB() {
	Boat testB = new Boat("E", "V", 1.0);
	assertEquals("E", testB.getName());
	assertEquals("V", testB.getCountryOfOrigin());
	assertEquals(1.0, testB.getSize());
	}
	
	@Test
	public void testSettersB() {
	Boat testB1 = new Boat("d","d", 1.0);
	testB1.setName("danny");
	testB1.setCountryOfOrigin("whatever");
	testB1.setSize(2.0);
	assertEquals("danny", testB1.getName());
	assertEquals("whatever", testB1.getCountryOfOrigin());
	assertEquals(2.0, testB1.getSize());
	}

}

