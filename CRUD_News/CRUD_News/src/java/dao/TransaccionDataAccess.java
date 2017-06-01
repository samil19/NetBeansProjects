/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import db.DBUtils;
import java.sql.Date;
import java.sql.PreparedStatement;
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
public class TransaccionDataAccess {
    public void addNew(Transaccion n, int id){
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Transaccion values( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, n.getTipoTransaccion());
            ps.setString(2, n.getTipoPago());
            ps.setDouble(3, n.getMonto());
            ps.setString(4, n.getComentario());
            ps.setDate(5, n.getFecha());
            ps.setString(6, n.getDireccion());
            ps.setDouble(7, n.getLatitud());
            ps.setDouble(8, n.getLongitud());
            ps.setInt(9, id);
            ps.executeUpdate();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    public static List<Transaccion> getAll(int id){
        List<Transaccion> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Transaccion where UserID ='"+id+"'").executeQuery();
            while(rs.next()){
                Transaccion n= new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDouble(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public static List<Transaccion> getNewById(int id){
        List<Transaccion> ls = new LinkedList<>();
        String sql = "select * from Transaccion where TransaccionID = " +id;
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
               Transaccion n= new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDouble(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    public void edit(int TransaccionID, String TipoTransaccion, String TipoPago, double Monto, String Comentario, Date Fecha, String Direccion, double Latitud, double Longitud, int id){
        try {
            String sql = "update Transaccion SET TipoTransaccion = ?, TipoPago = ?, Monto = ?, Comentario = ?, Fecha = ?, Direccion = ?, Latitud = ?, Longitud = ?, USerID = ?" + " where TransaccionID = "+ TransaccionID;
            String sql1 = "update CorteInfo  SET TipoTransaccion = ?, TipoPago = ?, Monto = ?, Comentario = ?, Fecha = ?, Direccion = ?, Latitud = ?, Longitud = ?, USerID = ?" + " where TransaccionID = "+ TransaccionID;
            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
            ps.setString(1, TipoTransaccion);
            ps.setString(2, TipoPago);
            ps.setDouble(3, Monto);
            ps.setString(4, Comentario);
            ps.setDate(5, Fecha);
            ps.setString(6, Direccion);
            ps.setDouble(7, Latitud);
            ps.setDouble(8, Longitud);
            ps.setInt(9, id);
            ps.executeUpdate();
            PreparedStatement ps1= DBUtils.getPreparedStatement(sql1);
            ps1.setString(1, TipoTransaccion);
            ps1.setString(2, TipoPago);
            ps1.setDouble(3, Monto);
            ps1.setString(4, Comentario);
            ps1.setDate(5, Fecha);
            ps1.setString(6, Direccion);
            ps1.setDouble(7, Latitud);
            ps1.setDouble(8, Longitud);
            ps1.setInt(9, id);
            ps1.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(int TransaccionID){
        try {
            String sql = "delete Transaccion where TransaccionID = ?";
            String sql2 = "delete CorteInfo where TransaccionID = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, TransaccionID);
            ps.executeUpdate();
            PreparedStatement ps2 = DBUtils.getPreparedStatement(sql2);
            ps2.setInt(1, TransaccionID);
            ps2.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void delete2(int TransaccionID){
        try {
            String sql = "delete Transaccion where TransaccionID = ?";
            
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, TransaccionID);
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
