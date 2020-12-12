/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author tharik
 */
public class OracleUtil implements DBUtil {

    @Override
    public void addStudent() {
        System.out.println("Adding a student to Oracle Database");
    }

    @Override
    public void getStudent() {
        System.out.println("Reading a student from Oracle Database");
    }

    @Override
    public void updateUpdate() {
        System.out.println("Updating a student in Oracle Database");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Deleting a student from Oracle Database");
    }
    
}
