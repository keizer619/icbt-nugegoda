/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageicbt;

/**
 *
 * @author user
 */
public class Employee extends Person {
     private String empno;

    public Employee() {
    }

    public Employee(String empno, String firstname, String lastname) {
        super(firstname, lastname);
        this.empno = empno;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }
    
}
