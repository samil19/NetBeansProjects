/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Thang
 */
public class DBUtils {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps =  null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-PRBVR6O\\SQLEXPRESS:2009;databaseName=Finanzas";
        String user = "sa";
        String pass = "12345";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        ps = con.prepareStatement(sql);
        
        return ps;
    }
    
    //Check connections.
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        getPreparedStatement("select * from Finanzas.RegistroTransacciones");
        
//    }

    public static CallableStatement prepareCall(String sql) throws ClassNotFoundException, SQLException{
       
        CallableStatement pc =  null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://DESKTOP-PRBVR6O\\SQLEXPRESS:2009;databaseName=Finanzas";
        String user = "sa";
        String pass = "12345";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        pc = con.prepareCall(sql);
        
        return pc;
    }
    
    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        prepareCall("select * from Finanzas.RegistroTransacciones");
//        
// }
    }

