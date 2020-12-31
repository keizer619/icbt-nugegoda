/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author trill
 */
public class Dog implements Animal{

    @Override
    public void move() {
        System.err.println("Dog is Moving");
    }

    @Override
    public void consume() {
        System.err.println("Dog is eating");
    }
    
}
