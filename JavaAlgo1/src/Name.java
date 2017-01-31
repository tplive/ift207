
public class Name {
	
	private String firstName;
	private String lastName;
	
	
	public Name() {
		firstName = "John";
		lastName = "Doe";
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setName(String first, String last) {
		
		firstName = first;
		lastName = last;
	}
	
	public void setFirstName(String first) {
		
		firstName = first;
	}
	
	public void setLastName(String last) {
		
		lastName = last;
	}
}
