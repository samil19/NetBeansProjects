/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getInt;
import static jdk.nashorn.internal.objects.NativeMath.random;
import model.Register;
import model.Login;
/**
 *
 * @author Samil
 */
public class LoginDataAccess {

    
    
    public void addNew(Register n) throws UnsupportedEncodingException{
        String uniqueID = UUID.randomUUID().toString();
        String Password = n.getPassword();
        String Passwordhash =null;
        Passwordhash=get_SHA_512_SecurePassword(Password,uniqueID);
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into [dbo].[User] values(?,?,?,?,?,?)");
            
            ps.setString(1, n.getLoginName());
            ps.setString(2, Passwordhash);
            ps.setString(3, n.getFirstName());
            ps.setString(4, n.getLastName());
            ps.setString(5, n.getEmail());
            ps.setString(6, uniqueID);
            ps.executeQuery();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List loguear(String LoginName,String Password) throws UnsupportedEncodingException{
        List<Register> ls = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        String basepassword = null;
        String Passwordhash =null;
        String salt=null;
        String Nombre = null;
        try {
            String sql ="SELECT * FROM [dbo].[User] WHERE LoginName = '"+ LoginName+"'" ;
            
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
                basepassword = rs.getString(3);
                Nombre=rs.getString(2);
            salt=rs.getString(7);   
            Register n = new Register (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            ls.add(n);
            list.add(String.valueOf(rs.getInt(1)));
            list.add(rs.getString(4));
            }
            Passwordhash=get_SHA_512_SecurePassword(Password,salt);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(LoginName.equals(Nombre)){
            if(Passwordhash.equals(basepassword)){
                
              return  list;
            }
            else{
                
               return null;
            }
        }
       return null;
    }
   
    
    public static String get_SHA_512_SecurePassword(String passwordToHash, String  salt) throws UnsupportedEncodingException{
String generatedPassword = null;
    try {
         MessageDigest md = MessageDigest.getInstance("SHA-512");
         md.update(salt.getBytes("UTF-8"));
         byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
         StringBuilder sb = new StringBuilder();
         for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
         }
         generatedPassword = sb.toString();
        } 
       catch (NoSuchAlgorithmException e){
       }
    return generatedPassword;
}
}
