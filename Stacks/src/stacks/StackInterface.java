/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Thomas Qvidahl
 * @param <T> Generic input object T
 */
public interface StackInterface<T> {
    
    /** Adds a new entry to the top of the stack.
     * @param newEntry An object to be added to the stack */
    public void push(T newEntry);
    
    /** Removes and returns the stack's top entry.
     * @return The object on the top of the stack
     * @throws EmptyStackException */
    public T pop();
    
    /** Retrieves the stacks top entry.
     * @return The object on top of the stack
     * @throws EmptyStackException if the stack is empty */
    public T peek();
    
    /** Detects whether this stack is empty
     * @return True if the stack is empty */
    public boolean isEmpty();
    
    /** Removes all entries from this stack */
    public void clear();
}
