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
public class Bird implements Animal{

    @Override
    public void move() {
        System.err.println("Bird is flying");
    }

    @Override
    public void consume() {
        System.err.println("Bird is eating");
    }
    
}
