/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sirisha
 */
public class Control {
    Auth login = new Auth();
    public boolean isValidUser() throws SQLException{
    
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        String query = "select * from new_user where mail = '"+login.eMail+"' and pass = '"+login.Password+"';";
        try {
            conn = Util.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        stmt = conn.createStatement();
        rset = stmt.executeQuery(query);
        if (rset.next()) {
            return true;
        } 
        
        return false;
    }
    
    public void showevent() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Connection con= null;
        Statement stm = null;
        ResultSet rs= null;
        
        //String sql= "select event_name,date from cal_ent where mail = '"+login.eMail+"';";
        String sql = "select * from new_user,cal_ent where new_user.mail = cal_ent.mail and new_user.mail = '"+ login.eMail+"';";
        try {
            con= Util.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        stm= con.createStatement();
        rs= stm.executeQuery(sql);
        
        
        if (rs.next())
        {
           show sh=new show();
           sh.setVisible(true);
           System.out.println("Hii sir how r u??");
           
        }
            
    }

    public Auth getLogin() {
        return login;
    }

    public void setLogin(Auth login) {
        this.login = login;
    }
    
}
