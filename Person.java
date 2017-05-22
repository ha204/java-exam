
public class Person {
	//Attributes
	public String firstName;
	public String surname;
	public String DOB;
	public String nationality;
	public String visaInformation;
	public String all;
	
	//Constructor of foreign people
	public Person(String firstName, String surname, String DOB, String nationality, String visaInformation){
	this.firstName = firstName;
	this.surname = surname;
	this.DOB = DOB;
	this.nationality = nationality;
	this.visaInformation = visaInformation;
	}
	
	//Constructor of UK people
	public Person(String firstName, String surname, String DOB, String nationality){
	this.firstName = firstName;
	this.surname = surname;
	this.DOB = DOB;
	this.nationality = nationality;
	}
	
	//if(this.nationality.equals("UK")){
	//	Person Person1 = new Person(firstName, surname, DOB, nationality);		}
	//	}
	
	//Methods
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVisaInformation() {
		return visaInformation;
	}

	public void setVisaInformation(String visaInformation) {
		this.visaInformation = visaInformation;
	}
	
	public String toString() {
		all = this.firstName+" - "+this.surname+" - "+this.DOB+" - "+this.nationality+" _ "+this.visaInformation + "\n";
		return all;
}
}