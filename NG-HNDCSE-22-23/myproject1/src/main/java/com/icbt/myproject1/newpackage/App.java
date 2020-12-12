/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.myproject1.newpackage;

/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String []args){
//        Student st = new Student("ST01", "Gihantha", "Sanjana");
        
        Student st = new Student();
        System.out.println(st.getLastName().trim());
    }
}
