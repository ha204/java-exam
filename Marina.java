
public class Marina {
//Attributes
	String name;
	String address;
	int space;
	String all;
	
	//Constructor
	Marina(String name, String address, int space){
	this.name = name;
	this.address = address;
	this.space = space;
	}
	//Methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String toString() {
		all = this.name+" - "+this.address+" - "+this.space + "\n";
		return all;
}
	
	
}
