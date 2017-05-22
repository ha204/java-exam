import static org.junit.Assert.*;

import org.junit.Test;

public class TestMarina {
	@Test
	public void testGettersM() {
	Marina testM = new Marina("E", "V", 100);
	assertEquals("E", testM.getName());
	assertEquals("V", testM.getAddress());
	assertEquals(100, testM.getSpace());
	}
	
	@Test
	public void testSettersM() {
	Marina testM1 = new Marina("d","d", 100);
	testM1.setName("danny");
	testM1.setAddress("whatever");
	testM1.setSpace(200);
	assertEquals("danny", testM1.getName());
	assertEquals("whatever", testM1.getAddress());
	assertEquals(200, testM1.getSpace());
	}

}