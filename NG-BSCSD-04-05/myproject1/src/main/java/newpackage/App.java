/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Buddhi
 */
public class App {
    public static void main(String[] args){
        //Student st = new Student();
        //st.setFirstName("John");
        //st.setLastName("Smith");
        //System.out.println(st.getFirstName());
        //System.out.println(st.getLastName());
        //System.out.println(st.setFullName());
        
        Student st = new Student();
        System.out.println(st.getLastName().trim());
    }
}
