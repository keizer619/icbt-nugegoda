/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Imasha
 */
public class Person {
    
    private String firstname;
    private String lastname;
    
    public Person(){
       this.firstname = "";
       this.lastname = "";
    }
    
    public String getFirstname(){
        return this.firstname;
        
    }
    
    public void setFirstname(String firstname){
         this.firstname = firstname;
        
    }
    
    public String getLastname(){
        return this.lastname;
        
    }
    
    public void setLastname(String lastname){
         this.lastname = lastname.toLowerCase();
        
    }
    
    public String getFullname(){
        return this.firstname +" "+ this.lastname;
        
    }
    
}
