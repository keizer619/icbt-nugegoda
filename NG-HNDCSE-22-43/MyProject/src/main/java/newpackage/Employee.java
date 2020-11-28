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
public class Employee extends Person{
    
    private String epfNo;
    

    public Employee(String epfNo) {
        this.epfNo = epfNo;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }
    
    
    
}
