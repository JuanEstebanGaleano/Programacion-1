package com.example;
import java.util.Date;

public class RegistroCuidado {
    private Date fecha;
    private String tipoCuidado;

    public RegistroCuidado(Date fecha, String tipoCuidado){
        this.fecha = fecha;
        this.tipoCuidado = tipoCuidado;
    }
    
    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoCuidado() {
        return this.tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }
}