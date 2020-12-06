/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author tharik
 */
public class App {
    
    public static void main(String [] args) {
        
        Animal animal1 = new Bird();
        
        Animal animal2 = new Dog();
        
        animal1.move();
        animal1.consume();
        
        
    }
    
}
