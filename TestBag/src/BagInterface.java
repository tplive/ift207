/**
 * An interface that describes the operations of a bag of objects.
 * @author Thomas Qvidahl
 *
 */
public interface BagInterface<T> {

	/** Gets current # of entries in this bag
	 * @return	The integer number of entries in bag
	 */
	public int GetCurrentSize();
	
	/** Sees whether this bag is empty
	 * @return      True/false if array is empty
	 */
	public boolean isEmpty();
	
	/** Adds a new entry to this bag.
	 * @param newEntry The object to be added as a new entry.
	 * @return True if addition successful.
	 */
	public boolean add(T newEntry);
	
	/** Removes an unspecified object from this bag, if possible.
	 * @return Either the removed entry, or null
	 */
	public T remove();
	
	/** Removes one occurrence of a given entry from this bag, if possible.
	 * @param anEntry The entry to remove
	 * @return True if successful.
	 */
	public boolean remove (T anEntry);
	
	/** Removes all items from the bag */
	public void clear();
	
	/** Counts number of times given entry appears in bag.
	 *  @param anEntry The entry to locate
	 *  @return The number of times item appears in bag
	 */
	public int getFrequencyOf(T anEntry);
	
	/** Tests whether this bag contains a given entry.
	 * 
	 */
	public boolean contains(T anEntry);
	
	/** Retrieves all entries that are in the bag.
	 * @return A newly allocated array of all the entries in the bag.
	 */
	public T[] toArray();
}// end BagInterface
