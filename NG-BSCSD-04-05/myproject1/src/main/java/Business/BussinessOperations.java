/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import db.DBUtil;

/**
 *
 * @author Buddhi
 */
public class BussinessOperations {
    
    public void process(DBUtil util){
        util.addStudent();
        util.addStudent();
        
        util.updateStudent();
        
        util.getStudent();
        util.getStudent();
        
        util.deleteStudent();
    }
}
