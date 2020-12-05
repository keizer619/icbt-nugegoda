/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.myproject;

/**
 *
 * @author trill
 */
public class Run {
    public static void main(String[] args){
//        System.err.println(Student.firstName);
        
        Student st = new Student();
        System.err.println(st.firstName);
        System.err.println(st.lastName);
        
        st.firstName = "aaa";
        
        Student st2 = new Student();
        System.err.println(st2.firstName);
        System.err.println(st2.lastName);
    }
    
}
