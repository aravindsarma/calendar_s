/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sirisha
 */
public class Util {
    static String regDriver = "com.mysql.jdbc.Driver";
   static String url = "jdbc:mysql://localhost:3306/calendar";
   static String username = "root";
   static String password = "";
    
    public static Connection getConnection() throws
            ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        Connection conn = null;
        Class.forName(regDriver).newInstance();
        conn = DriverManager.getConnection(url,username,password);
             
        return conn;
    }
    
}
