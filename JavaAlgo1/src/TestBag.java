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
public class TestBag {
    
    public static void main(String[] args) {
        
        LinkedBag bag = new LinkedBag<>();
        bag.add("Eple");
        bag.add("Plomme");
        bag.add("Klementin");
        bag.add("Appelsin");
        bag.add("Gulrot");
        bag.add("Banan");
        bag.remove();
        boolean fjernet = bag.remove("Appelsin");
        Object[] tabell = bag.toArray();
        
        System.out.println("Nå er vi ferdige");
    }
    
}
