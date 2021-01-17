/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tharik
 */
@WebService(serviceName = "MyService")
public class MyService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hi " + txt + " !!";
    }
    
    @WebMethod(operationName = "getStudent")
    public Student getStudent(@WebParam(name = "id") String id) { 
        //Should from DB
        Student st = new Student("02", "George", "456");
        return st;
    }
    
    @WebMethod(operationName = "getStudents")
    public List<Student> getStudents() { 
        List<Student> students  = new ArrayList<>();
        
        //Should from DB
        Student st = new Student("02", "George", "456");
        students.add(st);
        
        return students;
    }
    
    @WebMethod(operationName = "addStudent")
    public boolean addStudent(@WebParam(name = "student") Student student) {    
        return true;
    }
    
    @WebMethod(operationName = "updateStudent")
    public boolean updateStudent(@WebParam(name = "student") Student student) {    
        return true;
    }
    
    @WebMethod(operationName = "deleteStudent")
    public boolean deleteStudent(@WebParam(name = "id") String id) {    
        return true;
    }
    
    @WebMethod(operationName = "authenticate")
    public User authenticate(@WebParam(name = "username") String username,@WebParam(name = "password") String password) {
        User user = null;
        List<User> users  = DBUtil.getUsers();
        for (User currentUser : users) {
            if (username.equals(currentUser.getUsername()) && password.equals(currentUser.getPassword())) {
                user = currentUser;
                break;
            }
        }
        return user;
    }
}
