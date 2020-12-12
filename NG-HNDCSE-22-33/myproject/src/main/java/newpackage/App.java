/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author trill
 */
public class App {
    public static void main(String[] args){
        
        Person [] person = new Person[4];
        
        person[0] = new Student("ST01", "John", "Smith");
        person[1] = new Student("ST01", "George", "Stuarts");
        person[2] = new Employee("1", "James", "Wasly");
        person[3] = new Employee("1", "Andrew", "Wallace");
        
        for(int i=0; i<person.length; i++){
            System.err.println(person[i].getFirstName());
        }
        
        Person p = new Employee();
        Person p1 = new Student();
    }
}
