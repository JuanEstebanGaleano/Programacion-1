package com.example;
import java.util.ArrayList;

public class Plantas {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientosLuz;
    private String requerimientosAgua;
    private String cuidadosEspecificos;

    public Plantas(String nombreComun, String nombreCientifico, String tipo, String requerimientosLuz, String requerimientosAgua, String cuidadosEspecificos) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientosLuz = requerimientosLuz;
        this.requerimientosAgua = requerimientosAgua;
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRequerimientosLuz() {
        return requerimientosLuz;
    }

    public String getRequerimientosAgua() {
        return requerimientosAgua;
    }

    public String getCuidadosEspecificos() {
        return cuidadosEspecificos;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRequerimientosLuz(String requerimientosLuz) {
        this.requerimientosLuz = requerimientosLuz;
    }

    public void setRequerimientosAgua(String requerimientosAgua) {
        this.requerimientosAgua = requerimientosAgua;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }
    
    }

