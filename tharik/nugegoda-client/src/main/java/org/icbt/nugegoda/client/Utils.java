/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.nugegoda.client;

import my.MyService;
import my.MyService_Service;
import my.User;

/**
 *
 * @author tharik
 */
public class Utils {
    public static User authenticate(String username, String password) {
        
         MyService_Service service = new MyService_Service();
         MyService proxy = service.getMyServicePort();
         
         return proxy.authenticate(username, password);
    }
}
