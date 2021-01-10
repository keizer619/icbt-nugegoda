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
//        Student st = new Student();
//        st.setFirstName("John");
//        st.setLastName("Smith");
//        Student st = new Student("John","Smith");
//        System.out.println(st.getFirstName());
//        System.out.println(st.getLastName());
//        System.out.println(st.setFullName());
//        
//        Student st = new Student();
//        System.out.println(st.getLastName().trim());
//        
//        Person st = new Student("ST04", "Gihantha", "Sanjana"); polymophysm (changing the forms)
//        System.out.println(st.getFirstName());
//        
//        st= new Employee("EM1", "Ricky", "Ponting"); polymophysm
//        System.out.println(st.getFirstName());
        
//        Person st1= new Student("ST03", "Akash", "Shamilka"); method overloading
//        Person st2= new Student("ST04", "Gihantha", "Sanjana");
//        Person em1= new Employee("EM1", "Ricky", "Ponting");
//        Person em2= new Employee("EM2", "Andrew", "Wallace");
        
        
        Person [] person = new Person[8];
        person[0] = new Student("ST01", "Buddhi", "Vikum");
        person[1]= new Student("ST02", "Kaveen", "Udesh");
        person[2]= new Student("ST03", "Akash", "Shamilka");
        person[3]= new Student("ST04", "Gihantha", "Sanjana");
        
        person[4]= new Employee("EM1", "Ricky", "Ponting");
        person[5]= new Employee("EM2", "Andrew", "Wallace");
        person[6]= new Employee("EM3", "John", "Smith");
        person[7]= new Employee("EM4", "Steve", "Smith");
        
        for (int i = 0; i < person.length; i++) {
//            System.out.println(person[i].getFirstName());
            System.out.println(person[i].getFullName());
        }  
    }
}
