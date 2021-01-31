/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharik
 */
public class DBUtil {
    
   // Should load from properities 
   static final String DB_URL = "jdbc:mysql://localhost:3306/icbt_nugegoda"; 
   static final String USER = "icbt";
   static final String PASS = "icbt@123";
   
   public static List<User> getUsers() {
       
   List<User> users = new ArrayList<>(); 
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.jdbc.Driver");

      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();

      String sql = "SELECT * FROM users";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         String username = rs.getString("username");
         String password = rs.getString("password");
         String firstName = rs.getString("first_name");
         String lastName = rs.getString("last_name");

         User user = new User(username, password, firstName, lastName);
         users.add(user);
      }
      rs.close();
   }catch(SQLException se){

      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   return users;
}
   
   public static User getUser(String username) {
        User user = null; 
        Connection conn = null;
        Statement stmt = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");

           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();

           String sql = "SELECT * FROM users WHERE username='" + username + "'";
           ResultSet rs = stmt.executeQuery(sql);
           //STEP 5: Extract data from result set
           while(rs.next()){
              String username1 = rs.getString("username");
              String password = rs.getString("password");
              String firstName = rs.getString("first_name");
              String lastName = rs.getString("last_name");

              user = new User(username1, password, firstName, lastName);
           }
           rs.close();
        }catch(SQLException se){

           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           try{
              if(stmt!=null)
                 conn.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
        return user;
   }
   
public static boolean addUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");

           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();

           String sql = "INSERT INTO `users` "
                   + "(`username`, `first_name`, `last_name`, `password`) "
                   + "VALUES ('" + user.getUsername() +  "',"
                   + " '" + user.getFirstName() + "', "
                   + "'" + user.getLastName() + "', "
                   + "'" + user.getPassword() + "');";
           stmt.executeUpdate(sql);
           return true;
        }catch(SQLException se){

           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           try{
              if(stmt!=null)
                 conn.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
        
        return false;
    }
   
   public static boolean updateUser(User user) {
        Connection conn = null;
        Statement stmt = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");

           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();

           String sql = "UPDATE `users` "
                   + "SET `first_name` = '" + user.getFirstName() + "', "
                   + "`last_name` = '" + user.getLastName() + "', "
                   + "`password`='" + user.getPassword() + "' "
                   + "WHERE (`username` = '" + user.getUsername() + "')";
           stmt.executeUpdate(sql);
           return true;
        }catch(SQLException se){

           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           try{
              if(stmt!=null)
                 conn.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
        
        return false;
   }
   
   public static boolean deleteUser(String username) {
 Connection conn = null;
        Statement stmt = null;
        try{
           Class.forName("com.mysql.jdbc.Driver");

           conn = DriverManager.getConnection(DB_URL, USER, PASS);
           stmt = conn.createStatement();

           String sql = "DELETE FROM `users` WHERE (`username` = '" + username + "')";
           stmt.executeUpdate(sql);
           return true;
        }catch(SQLException se){

           se.printStackTrace();
        }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }finally{
           try{
              if(stmt!=null)
                 conn.close();
           }catch(SQLException se){
           }// do nothing
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }//end try
        
        return false;
   }
}