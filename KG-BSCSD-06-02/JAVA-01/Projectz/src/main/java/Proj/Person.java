/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj;

/**
 *
 * @author Kaushalya
 */
public class Person {

    private String firstName;
    private String lastName;
    
    
    public Person() {
        this.firstName="kaushalya";
        this.lastName="";
    }
    
    public Person(String firstName,String lastName){
         this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
}
