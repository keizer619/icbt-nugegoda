/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.my.web.app;

/**
 *
 * @author tharik
 */
public class Utils {
    public static boolean authenticate(String username, String password) {
        //TODO : These needs to be loaded from a DB
        return username.equals("admin") && password.equals("admin123");
    }
}
