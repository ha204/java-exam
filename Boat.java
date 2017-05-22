import java.util.ArrayList;

public class Boat implements Vehicle {

	//Attributes
	String boatName;
	String countryOfOrigin;
	double size;
	String all;
	ArrayList<Person> onboard = new ArrayList<Person>();
	
	//Constructor
	Boat(String boatName, String countryOfOrigin, double size){
		this.boatName = boatName;
		this.countryOfOrigin = countryOfOrigin;
		this.size = size;
	}
	
	//Methods

	public String getName() {
		return boatName;
	}

	public void setName(String name) {
		this.boatName = name;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryofOrigin) {
		this.countryOfOrigin = countryofOrigin;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String toString() {
		all = this.boatName+" - "+this.countryOfOrigin+" - "+this.size + "\n";
		return all;
}
	
	@Override
	public int getSpeed() {
		
		return 0;
	
	}

	@Override
	public void acccelerate() {
		
	}

	@Override
	public void deccelerate() {
		
	}
	
	
	
}
