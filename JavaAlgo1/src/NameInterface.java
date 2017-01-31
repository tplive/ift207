/** An interface for a class of names */
public interface NameInterface {
	/** Sets the first and last names
	 * @param firstName A string with first name
	 * @param lastName A string with last name
	 */
	
	public void setName(String firstName, String lastName);
	
	/** Gets the full name
	 * @return A string containing the first and last name
	 */
	public String getName();
	
	public void setFirst(String firstName);
	public String getFirst();
	
	public void setLast(String lastName);
	public String getLast();
	
	public void giveLastNameTo(NameInterface aName);
	
	public String toString();
} // end interface
