/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class TestBag {
    
    public static void main(String[] args) {
        
        System.out.println("Creating an empty bag.");
        BagInterface<String> aBag = new LinkedBag<>();
        
        testIsEmpty(aBag, true);
        displayBag(aBag);
        System.out.println(aBag.contains("S"));
        
        String[] contentsOfBag = {"A", "D", "B", "A", "C", "A", "D"};
        testAdd(aBag, contentsOfBag);
        testIsEmpty(aBag, false);
        
        System.out.println (aBag.getFrequencyOf("A"));
        System.out.println (aBag.contains("Z"));
        
        System.out.println (aBag.remove());
        System.out.println (aBag.remove());
        displayBag(aBag);
        
    }// end main

    private static void testIsEmpty(BagInterface<String> bag, boolean empty) {
        
        System.out.print("\nTesting isEmpty with ");
        if (empty)
            System.out.println("an empty bag");
        else
            System.out.println("a bag that is not empty");
        
        System.out.print("isEmpty finds the bag ");
        if (empty && bag.isEmpty())
            System.out.println("empty: OK.");
        else if (empty)
            System.out.println("not empty, but this is: ERROR.");
        else if (!empty && bag.isEmpty())
            System.out.println("empty, but it's not: ERROR.");
        else
            System.out.println("Not empty. OK.");
        
        
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content) {
        System.out.print("Adding ths following " + content.length + " strings to the bag: ");
        for (int index = 0; index < content.length; index++) {
            if (aBag.add(content[index]))
                System.out.print(content[index] + " ");
            else
                System.out.print("\nUnable to add " + content[index] + " to the bag");
        }
        System.out.println();
        
        displayBag(aBag);
    }

    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains the following string(s):");
        Object[] bagArray = aBag.toArray();
        for (int index = 0; index < bagArray.length; index++) {
            System.out.print(bagArray[index] + " ");
        }
        System.out.println();
    }
    
}
