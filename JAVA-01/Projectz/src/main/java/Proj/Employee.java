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
public class Employee extends Person{
    
    private String empNO;
    
    public Employee() {
        this.empNO="";
    }
    
    public Employee(String empNo,String fName,String lName){
        
        super(fName,lName);
        this.empNO=empNo;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }
    
    
}
