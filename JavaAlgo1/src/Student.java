
public class Student {
	
	private Name fullName;
	private String id;
	
	public Student() {
		fullName = new Name();
		id = "";
	}
	
	public void setStudent(Name studentName, String studentId) {
		
		setName(studentName);
		setId(studentId);
	}

	private void setId(String studentId) {

		id = studentId;
	}

	private void setName(Name studentName) {
		fullName = studentName;
	}
	
	public Name getName() {
		return fullName;
	}
	
	public String getId() {
		
		return id;
	}
	
	public String toString() {
		
		return id + " " + fullName.toString();
	}
	
	
	
	
}
