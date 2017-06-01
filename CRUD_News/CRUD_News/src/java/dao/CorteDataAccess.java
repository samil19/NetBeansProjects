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
import java.util.LinkedList;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Corte;

/**
 *
 * @author Samil
 */
public class CorteDataAccess {
     
    public static List<Corte> getAll(int id){
        List<Corte> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Corte where UserID ='"+id+"'").executeQuery();
            while(rs.next()){
                Corte n= new Corte(rs.getInt(1), rs.getDouble(2), rs.getDouble(3), rs.getDouble(4), rs.getDate(5), rs.getDate(6), rs.getInt(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public void corte(int CorteID, int id, Date FechaInicio, Date FechaFinal){
        try {
            double egresos=0;
            double ingresos=0;
            double corte;
            TransaccionDataAccess da = new TransaccionDataAccess();
             String sqle = "select * from Transaccion where TipoTransaccion = 'Egreso' AND UserID = '" +id+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet rs = DBUtils.getPreparedStatement(sqle).executeQuery();
            while(rs.next()){
                egresos -= rs.getDouble(4);
                da.delete2(rs.getInt(1));
            }
            
            
            String sqli = "select * from Transaccion where TipoTransaccion = 'Ingreso' AND UserID = '" +id+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet ri = DBUtils.getPreparedStatement(sqli).executeQuery();
            while(ri.next()){
                ingresos += ri.getDouble(4);
                da.delete2(ri.getInt(1));
            }
            
            
            corte=egresos+ingresos;
            
             PreparedStatement pq = DBUtils.getPreparedStatement("insert into Corte values(?,?,?,?,?,?)");
            pq.setDouble(1, egresos);
            pq.setDouble(2, ingresos);
            pq.setDouble(3, corte);
            pq.setDate(4, FechaInicio);
            pq.setDate(5, FechaFinal);
            pq.setInt(6,id);
            pq.executeUpdate();
            
            corte2(egresos,ingresos,corte,id,FechaInicio,FechaFinal);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void corte2(double eg, double in, double corte, int id, Date FechaInicio, Date FechaFinal){
        int ID1=0;
        try {
            ResultSet rt = DBUtils.getPreparedStatement("select * from Corte where CantidadEgresos = "+eg+" AND CantidadIngresos = "+in+" AND Corte = "+corte+" AND UserID = '"+id+"'").executeQuery();
            while(rt.next()){
               ID1+=rt.getInt(1);
            }
            String sqlo = "update CorteInfo SET CorteID= ? " + "where CorteID = 0 AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            PreparedStatement pz= DBUtils.getPreparedStatement(sqlo);
            pz.setInt(1, ID1);
            pz.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
