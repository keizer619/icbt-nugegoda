/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Business.BussinessOperations;
import db.DBUtil;
import db.MySQLUtil;
import db.OracalUtil;

/**
 *
 * @author Buddhi
 */
public class App {
    public static void main(String[] args){
        
//        DBUtil util = new MySQLUtil();
        DBUtil util = new OracalUtil();
        
        BussinessOperations operations = new BussinessOperations();
            operations.process(util);
    }
}
