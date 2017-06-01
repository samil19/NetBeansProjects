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
public class Corte {
    private int CorteID;
    private double CantidadEgresos;
    private double CantidadIngresos;
    private double Corte;
    private Date FechaInicio;
    private Date FechaFinal;
    private int UserID;

    public Corte(int CorteID, double CantidadEgresos, double CantidadIngresos, double Corte, Date FechaInicio, Date FechaFinal, int UserID) {
        this.CorteID = CorteID;
        this.CantidadEgresos = CantidadEgresos;
        this.CantidadIngresos = CantidadIngresos;
        this.Corte = Corte;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.UserID = UserID;
    }

    
    
    
    
    public int getCorteID() {
        return CorteID;
    }

    public void setCorteID(int CorteID) {
        this.CorteID = CorteID;
    }

    public double getCantidadEgresos() {
        return CantidadEgresos;
    }

    public void setCantidadEgresos(double CantidadEgresos) {
        this.CantidadEgresos = CantidadEgresos;
    }

    public double getCantidadIngresos() {
        return CantidadIngresos;
    }

    public void setCantidadIngresos(double CantidadIngresos) {
        this.CantidadIngresos = CantidadIngresos;
    }

    public double getCorte() {
        return Corte;
    }

    public void setCorte(double Corte) {
        this.Corte = Corte;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
    
    
    
    
    
    
    
    
}