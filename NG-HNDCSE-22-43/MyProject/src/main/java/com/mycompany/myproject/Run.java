/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myproject;

/**
 *
 * @author Imasha
 */
public class Run {
    
    public static void main(String args[]){
        System.out.println("Hello World");
        
        System.out.println(Student.fullname);
        
        Student st = new Student();
        st.fullname = "Masha";
        System.out.println(st.fullname);
        System.out.println(st.lastname);
        
        Student st2 = new Student();
        st.fullname = "Imasha";
        System.out.println(st2.fullname);
        System.out.println(st2.lastname);
    }
    
}
