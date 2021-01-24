/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.ndesignpatterns;

/**
 *
 * @author tharik
 */
public class App {
    public static void main(String[] args) {
        Test t = Test.getInstance();
        t.test();
        
        Test t2 = Test.getInstance();
        t2.test();
    }
}
