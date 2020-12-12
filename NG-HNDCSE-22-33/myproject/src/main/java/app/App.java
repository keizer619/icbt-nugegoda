/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import business.BusinessOperations;
import db.DBUtil;
import db.OracleUtil;
/**
 *
 * @author trill
 */
public class App {
    public static void main(String[] args){
        
        DBUtil util = new OracleUtil();
        
        BusinessOperations operations = new BusinessOperations();
        operations.process(util);
    }
}
