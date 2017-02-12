/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 * @param <T>
 */
public final class LinkedBag<T> implements BagInterface<T> {
    
    private Node firstNode;
    private int numberOfEntries;
    
    public LinkedBag() {
        
        firstNode = null;
        numberOfEntries = 0;
    }
    
    private Node getReferenceTo(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data))
                found = true;
            else 
                currentNode = currentNode.next;
            
        }// end while
        return currentNode;
    } // end getReference
    
    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;
        firstNode = newNode;
        numberOfEntries++;
        return true;
    }

    @Override
    public int GetCurrentSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    @Override
    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            firstNode = firstNode.next;
            numberOfEntries--;
        }// end if
        return result;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean result = false;
        Node nodeN = getReferenceTo(anEntry);
        
        if (nodeN != null) {
            nodeN.data = firstNode.data; // Replace located entry with entry in first node
            firstNode = firstNode.next; // Remove first node
            numberOfEntries--;
            result = true;
        } // end if
        
        return result;
    }

    @Override
    public void clear() {
        while(!isEmpty()) {
            remove();
        } // end while
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;
        while((loopCounter < numberOfEntries) && (currentNode != null)) {
            if (anEntry.equals(currentNode.data))
                frequency++;
            
            loopCounter++;
            currentNode = currentNode.next;
        }// end while
        
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        
        boolean found = false;
        Node currentNode = firstNode;
        
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data))
                found = true;
            else
                currentNode = currentNode.next;
        }//end while
        
        return  found;
        
    }

    @Override
    public T[] toArray() {
        
        T[] result = (T[])new Object[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        } // end while
        
        return result;
    }
    
    
    private class Node {
        private T data;
        private Node next;
        
        private Node(T dataPortion) {
            
            this(dataPortion, null);
        }
        
        private Node(T dataPortion, Node nextNode) {
            
            data = dataPortion;
            next = nextNode;
        }
    }
    
    
}
