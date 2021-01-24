/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.usage;


import factory.Shape;
import factory.ShapeFactory;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String [] args) {
        ShapeFactory factory = new ShapeFactory();
        
        Shape shape1 = factory.getShape("Circle");
        Shape shape2 = factory.getShape("Square");
        Shape shape3 = factory.getShape("Rectangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
