/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Thomas Qvidahl
 */
public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int size = 4;
        MinStack stakken = new MinStack(size);
        
        stakken.push("Thomas");   //Thomas
        stakken.push("Eline");    //Eline, Thomas
        stakken.push("Vilde");    //Vilde, Eline, Thomas
        stakken.push("Emil Abel");//Emil Abel, Vilde, Eline, Thomas
        stakken.push("Over the limit"); // Dobler kapasiteten og legger til strengen
        
        while (stakken.isEmpty() == false) {
            
            System.out.println("Peek at stack: " + stakken.peek()); 
            System.out.println("Pop element: " + stakken.pop());  
        }
        
        stakken.push("Harald Rex");
        stakken.push("Sonja");
        stakken.push(stakken.peek()); 
        System.out.println(stakken.peek());
        stakken.push(stakken);
        System.out.println(stakken.peek());
        stakken.push(stakken.peek());
        System.out.println(stakken.peek());
        stakken.push("Kronprins Haakon Magnus");
        System.out.println(stakken.peek());
        
        stakken.clear();
        System.out.println(stakken.peek());
    }
    
}
