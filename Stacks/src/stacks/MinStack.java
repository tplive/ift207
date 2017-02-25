/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Arrays;

/**
 *
 * @author Thomas Qvidahl
 * @param <T> Stack med T-objekter
 */
public class MinStack<T> implements StackInterface {
    
    private int top;
    private int arraySize;
    private T[] stack;
    
    MinStack(int size) {
        arraySize = size;
        T[] tStack = (T[]) new Object[arraySize];
        stack = tStack;
        top = 0;
        
    }
    
    @Override
    public void push(Object newEntry) {
        
        /** Sjekk om vi har nådd kapasiteten til arrayet og doble
         * top peker alltid på det neste elementet og er 0-index basert.
         * ArraySize er størrelsen på array i antall element.
         * Derfor, når NESTE element er lik arraySize (dvs ett element MER
         * enn arraySize, kjører vi metoden som dobler kapasitet. */

        if (top == arraySize) {
            doubleCapacity();
        }
        
        //Cast newEntry to a T
        
        stack[top] = (T) newEntry;
        top++;
    }

    @Override
    public Object pop() {
        
        if (this.isEmpty()) {
            return null;
        }else{
            T element = stack[top-1];
            stack[top-1] = null;
            top--;
            return element;
        }
    }

    @Override
    public Object peek() {
        
        // Hvis stakken er tom, må vi returnere null
        if (this.isEmpty()) {
            return null;           
        }else{
            return stack[top-1];
        }
    }

    @Override
    public boolean isEmpty() {
        boolean tomt = false;
        if (top == 0) {
            tomt = true;
        }else{
            tomt = false;
        }
        return tomt;
    }

    @Override
    public void clear() {
        
        while(this.isEmpty() == false) {
            this.pop();
        }
    }
    
    private void doubleCapacity() {
        
        int newLength = stack.length * 2;
        stack = Arrays.copyOf(stack, newLength);
        this.arraySize = newLength;
    }
    
}
