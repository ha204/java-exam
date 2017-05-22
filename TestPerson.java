import static org.junit.Assert.*;

import org.junit.Test;
public class TestPerson {

@Test 
public void testGetters() {
Person testing = new Person("A", "B", "C", "D", "E");
assertNotNull(testing.getFirstName());
assertNotNull(testing.getSurname());
assertNotNull(testing.getDOB());
assertNotNull(testing.getNationality());
assertNotNull(testing.getVisaInformation());
}

@Test
public void testVisa(){
Person test = new Person ("A", "B", "c", "d", "");
assertEquals("",test.getVisaInformation());
}

@Test
public void testSetters(){
	Person test2 = new Person("","","","","");
	test2.setFirstName("A");
	test2.setSurname("B");
	test2.setDOB("C");
	test2.setNationality("D");
	test2.setVisaInformation("E");
	assertEquals("A",test2.getFirstName());
	assertEquals("B",test2.getSurname());
	assertEquals("C",test2.getDOB());
	assertEquals("D",test2.getNationality());
	assertEquals("E",test2.getVisaInformation());
}

	
}
	


	
