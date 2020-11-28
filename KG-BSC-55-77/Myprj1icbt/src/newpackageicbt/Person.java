/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageicbt;

/**
 *
 * @author user
 */
public class Person {
      private String firstname;
    private String lastname;
    
    public Person(){
    this.firstname="";
    this.lastname="";
    
    }
    public Person(String firstname,String lastname){
    this.firstname= firstname;
    this.lastname=  lastname;      
    
    }
    
public String getFirstname(){
    
 return this.firstname;
    }public  void setFirstName(String firstName){
        
      this.firstname=firstName; 
    
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFullname(){
   return this.firstname+" "+this.lastname;  
     
    }
    
}
