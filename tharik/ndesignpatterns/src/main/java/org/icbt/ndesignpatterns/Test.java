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
public class Test {
    
    private static Test instance = new Test();
    
    private Test() {

    }
    
    public static Test getInstance() {
        return instance;
    }
    
    public void test() {
       System.out.print("testing123......");
    }
}
