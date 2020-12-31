/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author Buddhi
 */
public class App {
    public static void main(String[] args){
        Calculator cal = new Calculator();
         int no1 = 6;
         int no2 = 2;
         
         
         System.out.println(no1 + "+" + no2 + "=" + cal.add(no1,no2));
         System.out.println(no1 + "+" + no2 + "=" + cal.subtract(no1,no2));
         System.out.println(no1 + "+" + no2 + "=" + cal.divide(no1,no2));
         System.out.println(no1 + "+" + no2 + "=" + cal.multiply(no1,no2));
    }
}
