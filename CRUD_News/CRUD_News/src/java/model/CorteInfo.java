/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Samil
 */
public class CorteInfo {
    private int ID;
    private int TransaccionID;
    private String TipoTransaccion;
    private String TipoPago;
    private double Monto;
    private String Comentario;
    private int CorteID;
    private Date Fecha;
    private String Direccion;
    private double Latitud;
    private double Longitud;

    public CorteInfo(int ID, int TransaccionID, String TipoTransaccion, String TipoPago, double Monto, String Comentario, int CorteID, Date Fecha, String Direccion, double Latitud, double Longitud) {
        this.ID = ID;
        this.TransaccionID = TransaccionID;
        this.TipoTransaccion = TipoTransaccion;
        this.TipoPago = TipoPago;
        this.Monto = Monto;
        this.Comentario = Comentario;
        this.CorteID = CorteID;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTransaccionID() {
        return TransaccionID;
    }

    public void setTransaccionID(int TransaccionID) {
        this.TransaccionID = TransaccionID;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public int getCorteID() {
        return CorteID;
    }

    public void setCorteID(int CorteID) {
        this.CorteID = CorteID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    

    
    
    
}