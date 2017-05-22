import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestReader {
	
	@Test
public void testReading() {

		Reader r = new Reader();
		String s = r.reading("C:\\FileInput\\stage_5_input.txt");
		String expected = "-Marinas--Monaco Yacht Club-Quai Louis II, 98000 Monaco-150-|-Venice Marinas-237 Sports Marina Rd, Venice, LA 70091, USA-300-|--Boats--Santa Maria-Portugal-0.8-|-Marys Dream-USA-2.3-|-Boaty McBoatface-Great Britain-3.8-|-Aquaholic-Panama-1.0-|--People--David Green-14/07/1952-British-|-Mary Jones-8/12/1968-Brtish-|-Mike Wozniak-02/04/1976-Polish-1759346/A-|-Bill Knightley-17/05/1943-Australian-9986342/B-|-Brian Johnson-05/10/1947-British-|-Linus Torvalds-28/12/1969-Finnish-88754438/A-|-Peter Jackson-31/10/1961-New Zealander-76446789/A-|-Adele something-05/05/1988-British-|-Emma Watson-15/04/1990-British-|-Avril Lavigne-27/09/1984-Canadian-35688643/C-|";
		assertEquals(expected , s);
	}

 @Test
public void testMarinaArray() {
	      Reader r = new Reader();
	      ArrayList<Marina> s = r.marinaArray("C:\\FileInput\\stage_5_input.txt");
	      String expected = "Monaco Yacht Club - Quai Louis II, 98000 Monaco - 150";
	      //,Venice Marinas - 237 Sports Marina Rd, Venice, LA 70091, USA - 300";
	        assertTrue(expected.equals(s.get(0)));
	    }

@Test
public void testPersonArray()  {
    Reader r = new Reader();
    ArrayList<Person> s = r.personArray("C:\\FileInput\\stage_5_input.txt");
    String expected = "David - Green - 14/07/1952 - British _ null, Mary - Jones - 8/12/1968 - Brtish _ null, Mike - Wozniak - 02/04/1976 - Polish _ 1759346/A, Bill - Knightley - 17/05/1943 - Australian _ 9986342/B, Brian - Johnson - 05/10/1947 - British _ null, Linus - Torvalds - 28/12/1969 - Finnish _ 88754438/A, Peter - Jackson - 31/10/1961 - New Zealander _ 76446789/A, Adele - something - 05/05/1988 - British _ null, Emma - Watson - 15/04/1990 - British _ null, Avril - Lavigne - 27/09/1984 - Canadian _ 35688643/C";
      assertEquals(Arrays.asList(expected), s);
  }

@Test
public void testBoatArray()  {
    Reader r = new Reader();
    ArrayList<Boat> s = r.boatArray("C:\\FileInput\\stage_5_input.txt");
    String expected = "Santa Maria - Portugal - 0.8";
    System.out.println(s.get(0));
    assertEquals(expected, s.get(0));
}
}
