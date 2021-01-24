/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilTest {
    
    public DBUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsers method, of class DBUtil.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        user.setPassword("pas123");
        user.setUsername("admin");
         
        List<User> result = DBUtil.getUsers();
       
        assertEquals(user.getFirstName(), result.get(0).getFirstName());
        assertEquals(user.getLastName(), result.get(0).getLastName());
        assertEquals(user.getPassword(), result.get(0).getPassword());
        assertEquals(user.getUsername(), result.get(0).getUsername());
    }
    
}
