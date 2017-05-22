import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Reader {
	
//	public static String reading(String fileName) throws Exception{
	
	public static String reading(String fileName) {
		String text = "";
		try{
		FileReader fileReader = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = reader.readLine();
		while (line != null) {
			text = text + "-"+ line;
			//text = text + line;
			line = reader.readLine();
		}
		
		reader.close();
		
		}  catch (IOException ioe) {
		    // Perform exception handling for IOException.
		}
		return text;
		}
	
	public ArrayList<Person> personArray(String fileName){
		
		ArrayList<Person> people = new ArrayList<Person>();
		String text = reading(fileName);
		//Creating array of [0]-marinas, and [1]-everythingelse
		String[] Everything = text.split("-Boats-");
	
		//Separating boats and people in an array
		String[] objects = Everything[1].split("-People-");
		
		
		//Isolating people
		String[] differentPeople = objects[1].split("\\|");
		
	String[] personAttributes = null;
	String[] fullName = null;
	
    	for(String s: differentPeople){
    		personAttributes = s.split("-");
		  	fullName = personAttributes[1].split("\\s");

	   if(personAttributes.length == 5){
			
			String firstName = fullName[0];	
			String surname = fullName[1];
			String DOB = personAttributes[2];
			String nationality = personAttributes[3];
			String visaInformation = personAttributes[4];
			Person currentPerson = new Person(firstName, surname, DOB, nationality, visaInformation);
			people.add(currentPerson);
			}
	   
		if(personAttributes.length == 4){
			
			String firstName = fullName[0];	
			String surname = fullName[1];
			String DOB = personAttributes[2];
			String nationality = personAttributes[3];
			Person currentPerson = new Person(firstName, surname, DOB, nationality);
			people.add(currentPerson);
			}
	  }
		return people;
		}
	
	public ArrayList<Marina> marinaArray(String fileName){
		ArrayList<Marina> marinas = new ArrayList<Marina>();
		String text = reading(fileName);
		
		//Creating array of [0]-marinas, and [1]-everythingelse
		String[] Everything = text.split("-Boats-");
		String[] differentMarinas = Everything[0].split("-Marinas-|\\|");
		
		
		String[] marinaAttributes = differentMarinas[1].split("-");
		String[] marinaAttributes1 = differentMarinas[2].split("-");

	
	String name = marinaAttributes[1];
	String address = marinaAttributes[2];
	int space = Integer.parseInt(marinaAttributes[3]);
	
	String name1 = marinaAttributes1[1];
	String address1 = marinaAttributes1[2];
	int space1 = Integer.parseInt(marinaAttributes1[3]);

	Marina currentMarina = new Marina(name, address, space);
	Marina currentMarina1 = new Marina(name1, address1, space1);
	
	marinas.add(currentMarina);
	marinas.add(currentMarina1);
//	for(int i = 0; i<marinas.size(); i++){
//System.out.println(marinas.get(i).toString());
//	}
return marinas;
	}
	
	public ArrayList<Boat> boatArray (String fileName){
		
		ArrayList<Boat> boats = new ArrayList<Boat>();
		String text = reading(fileName);
		
				//Creating array of [0]-marinas, and [1]-everythingelse
				String[] Everything = text.split("-Boats-");
			
				//Separating boats and people in an array
				String[] objects = Everything[1].split("-People-");
				
				//Isolating boats
				String[] differentBoats = objects[0].split("\\|");

				String[] boatAttributes1 = differentBoats[0].split("-");
				String[] boatAttributes2 = differentBoats[1].split("-");
				String[] boatAttributes3 = differentBoats[2].split("-");
				String[] boatAttributes4 = differentBoats[3].split("-");
				
				String boatName1 = boatAttributes1[1];
				String countryOfOrigin1 = boatAttributes1[2];
				double size1 = Double.parseDouble(boatAttributes1[3]);
				
				String boatName2 = boatAttributes2[1];
				String countryOfOrigin2 = boatAttributes2[2];
				double size2 = Double.parseDouble(boatAttributes2[3]);
				
				String boatName3 = boatAttributes3[1];
				String countryOfOrigin3 = boatAttributes3[2];
				double size3 = Double.parseDouble(boatAttributes3[3]);
				
				String boatName4 = boatAttributes4[1];
				String countryOfOrigin4 = boatAttributes4[2];
				double size4 = Double.parseDouble(boatAttributes4[3]);
				
				Boat currentBoat1 = new Boat(boatName1, countryOfOrigin1, size1);
				Boat currentBoat2 = new Boat(boatName2, countryOfOrigin2, size2);
				Boat currentBoat3 = new Boat(boatName3, countryOfOrigin3, size3);
				Boat currentBoat4 = new Boat(boatName4, countryOfOrigin4, size4);
				
				boats.add(currentBoat1);
				boats.add(currentBoat2);
				boats.add(currentBoat3);
				boats.add(currentBoat4);
				
				
				
				
				
				//My attempt of not hardcoding the addition of boats in to the "boats" arraylist:

//		String[] boatAttributes = null;
//		for(String s : differentBoats){
//			boatAttributes = s.split("-");
//			System.out.println(boatAttributes[0]);
//				String boatName = boatAttributes[1];
//	     		String countryOfOrigin = boatAttributes[2];
//				double size = Double.parseDouble(boatAttributes[3]);
//				Boat currentBoat = new Boat(boatName, countryOfOrigin, size);
//				boats.add(currentBoat);
//		}
//			
		return boats;
	}
	
}