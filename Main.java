import java.util.ArrayList;

public class Main {
public static void main(String[] args) throws Exception {
	Reader r = new Reader();
	
	//Reader.reading("C:\\FileInput\\stage_5_input.txt");
//	String s = Reader.reading("C:\\FileInput\\stage_5_input.txt");
//	Reader.saving(s);

	ArrayList<Marina> a1 = r.marinaArray("C:\\FileInput\\stage_5_input.txt");
	System.out.println(a1);
	
	ArrayList<Person> a2 = r.personArray("C:\\FileInput\\stage_5_input.txt");
	System.out.println(a2);
	
	ArrayList<Boat> a3 = r.boatArray("C:\\FileInput\\stage_5_input.txt");
	System.out.println(a3);
}
	
	
}
