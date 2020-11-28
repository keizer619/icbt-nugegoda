/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String []args) {
        Person [] person = new Person[4];
        person[0] = new Student("ST01", "John", "Smith");
        person[1]= new Student("ST01", "George", "Stuarts"); 
        person[2]= new Employee("1", "James", "Wesly");
        person[3]= new Employee("1", "Andrew", "Wallace");
        
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getFirstName());
        }        
    }
    
}
