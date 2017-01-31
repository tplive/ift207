import java.util.Arrays;

import javax.management.DescriptorRead;

public final class ArrayBag<T> implements BagInterface<T> {

	private final T[] bag;
	private int numberOfEntries;
	private static final int DEFAULT_CAPACITY = 25;
	private boolean initialized = false;
	private static final int MAX_CAPACITY = 10000;

	/** Creates an empty bag whose initial capacity is 25 */
	public ArrayBag() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Creates an empty bag having given initial capacity.
	 * 
	 * @param capacity
	 *            The integer capacity desired.
	 */
	public ArrayBag(int desiredCapacity) {

		if (desiredCapacity <= MAX_CAPACITY) {

			// The cast is safe because the new array contains null entries.
			@SuppressWarnings("unchecked")
			T[] tempBag = (T[]) new Object[capacity]; // Unchecked cast
			bag = tempBag;
			numberOfEntries = 0;
			initialized = true;
		} else {
			throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
		}
	} // end constructor

	/**
	 * Adds a new entry to this bag.
	 * 
	 * @param newEntry
	 *            The object to be added as a new entry.
	 * @return True if the addition is successful, or false if not.
	 */
	public boolean add(T newEntry) {
		
		checkInitialization();
		boolean result = true;
		if (isArrayFull()) {
			result = false;
		} else {
			// Assertion: result is true here
			bag[numberOfEntries] = newEntry;
			numberOfEntries++;
		} // end if
		return result;
	}// end add

	/**
	 * Retrieves all entries that are in this bag.
	 * 
	 * @return A newly allocated array of all the entries in the bag.
	 */
	public T[] toArray() {
		checkInitialization();
		return Arrays.copyOf(bag, bag.length);
	} // end toArray
	
	public T remove() {
		return null; //STUB
	}// end remove
	
	public void clear() {
		// STUB
	} // end clear

	// Returns true if the arraybag is full, false if not.
	private boolean isArrayFull() {
		return numberOfEntries >= bag.length;
	} // end isArrayFull
	
	private void checkInitialization() {
		if(!initialized)
			throw new SecurityException("ArrayBag object is not initialized properly.");
	}// end checkInitialization
	
	

}
