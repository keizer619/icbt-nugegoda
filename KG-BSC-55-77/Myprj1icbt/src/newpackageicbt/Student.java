/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageicbt;

import myprj1icbt.*;

/**
 *
 * @author user
 */
public class Student extends Person{
    
    private String stdID;
    
    public Student(){
        super();
    this.stdID="";
    
    }

    public Student(String stdID, String firstname, String lastname) {
        super(firstname, lastname);
        this.stdID = stdID;
    }
    

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }
    
    
    
  
    
    
}
