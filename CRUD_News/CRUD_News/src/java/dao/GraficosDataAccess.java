/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transaccion;

/**
 *
 * @author Samil
 */
public class GraficosDataAccess {
    
    public static List<Transaccion> getAll(){
        List<Transaccion> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Transaccion").executeQuery();
            while(rs.next()){
                Transaccion n= new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDouble(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    
}
