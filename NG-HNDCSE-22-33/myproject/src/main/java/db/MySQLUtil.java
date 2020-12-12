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
public class MySQLUtil implements DBUtil{

    @Override
    public void addStudent() {
        System.out.println("Adding a student to MySQL Database");
    }

    @Override
    public void getStudent() {
        System.out.println("Reading a student to MySQL Database");
    }

    @Override
    public void updateStudent() {
        System.out.println("Updating a student to MySQL Database");
    }

    @Override
    public void deleteStudent() {
        System.out.println("Deleting a student to MySQL Database");
    }
    
}
