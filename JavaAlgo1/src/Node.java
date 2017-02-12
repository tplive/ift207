/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 * @param <T>
 * @author Thomas
 */
class Node<T> {
    
    private T data; // Entry in bag
    private Node next; // Link to next node
    
    public Node(T data) {
        // First element in linked 
        this(data, null);
    }

    public Node(T dataPortion, Node nextNode) {
        data = dataPortion;
        next = nextNode;
    }// end constructor
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }

}// end Node
