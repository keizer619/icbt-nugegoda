/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject1;

/**
 *
 * @author Buddhi
 */
public class Run {
    public static void main(String[] args){   
    //System.out.print("Helllo World");
    
    //System.out.println(Student.firstname); 
    //System.out.print(Student.lastname); because its not a static field in Student class
    
    
    Student st = new Student(); //creating new object
    System.out.println(st.firstname);
    System.out.println(st.lastname);
    
    st.firstname="aaa";
    
    Student st2 = new Student(); //creating new object
    System.out.println(st2.firstname);
    System.out.println(st2.lastname);
    }
}
