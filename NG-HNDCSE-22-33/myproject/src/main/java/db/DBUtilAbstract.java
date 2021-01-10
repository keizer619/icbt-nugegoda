/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author trill
 */
public abstract class DBUtilAbstract {
    
    public void connect(){
        ////
    }
    
    public abstract void addStudent();
    
    public abstract void getStudent();
    
    public abstract void updateStudent();
    
    public abstract void deleteStudent();
}
