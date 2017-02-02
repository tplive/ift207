/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author Thomas
 */
public class LinkedBag<T> implements BagInterface<T> {
    
    private int antallElementer;
    private Node firstNode;
    
    public LinkedBag() {
        
        firstNode = null;
        antallElementer = 0;
    } // end default constructor
    
    
    
    
    @Override
    public int GetCurrentSize() {
    return antallElementer;
    }

    @Override
    public boolean isEmpty() {
        return antallElementer == 0;
    }

    @Override
    public boolean add(T newEntry) {
        
        if (!isEmpty()) {
            Node nowNode = firstNode;
            firstNode = new Node(newEntry, nowNode);
            antallElementer++;
            return true;
        } else {
            firstNode = new Node(newEntry);
            antallElementer++;
            return true;
        }
        
        // trenger noe exception handling her, som kan returnere false
        
    }

    @Override
    public T remove() {
        if (!isEmpty()) {
            T data = (T)firstNode.getData();
            firstNode = firstNode.getNext();
            antallElementer--;
            return data;
        } else {
            return null;
        }
    }
    

    @Override
    public boolean remove(T anEntry) {
        
        // Spesialtilfelle på første element
        if (firstNode.getData().equals(anEntry)) {
            firstNode = firstNode.getNext();
            return true;
        }else {
            // Hvis ikke treff på første, traversere gjennom alle
            Node prevNode = firstNode;
            Node nowNode = firstNode.getNext();
            while(nowNode != null) {
                
                if (nowNode.getData().equals(anEntry)) {
                    prevNode.setNext(nowNode.getNext());
                    return true;
                }
                
                prevNode = nowNode;
                nowNode = nowNode.getNext();
            }
        }
        return false;
    }

    @Override
    public void clear() {
        while (firstNode != null) {
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int noOfElements = 0;
        if (!isEmpty()) {
            
            Node nowNode = firstNode;
            while(nowNode != null) {
                if (nowNode.getData().equals(anEntry)) {
                    noOfElements++;
                    nowNode = nowNode.getNext();
                }else {
                    nowNode = nowNode.getNext();
                }
            }
        }
        return noOfElements;
    }

    @Override
    public boolean contains(T anEntry) {
        
        if (!isEmpty()) {
            
            Node nowNode = firstNode;
            while(nowNode != null) {
                if (nowNode.getData().equals(anEntry))
                    return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] tabell = (T[])new Object[antallElementer-1];
        Node nowNode = firstNode;
        int teller = 0;
        while (nowNode != null) {
            tabell[teller] = (T)nowNode.getData();
            nowNode = nowNode.getNext();
            teller++;
        }
        return tabell;
    }
    
    // Hva trenger vi?
    // antallElementer int
    // førsteNode Node
    // 
    
    
}
