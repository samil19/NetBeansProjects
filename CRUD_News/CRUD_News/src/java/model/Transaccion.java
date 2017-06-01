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
public class Transaccion {
    private int TransaccionID;
    private String TipoTransaccion;
    private String TipoPago;
    private double Monto;
    private String Comentario;
    private Date Fecha;
    private String Direccion;
    private double Latitud;
    private double Longitud;

    public Transaccion(int TransaccionID, String TipoTransaccion, String TipoPago, double Monto, String Comentario, Date Fecha, String Direccion, double Latitud, double Longitud) {
        this.TransaccionID = TransaccionID;
        this.TipoTransaccion = TipoTransaccion;
        this.TipoPago = TipoPago;
        this.Monto = Monto;
        this.Comentario = Comentario;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
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
