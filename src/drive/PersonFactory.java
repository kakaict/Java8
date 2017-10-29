package drive;

public interface PersonFactory <P extends Person> {
	
	public  P createPerson(String fName, String lName); 
	

}
