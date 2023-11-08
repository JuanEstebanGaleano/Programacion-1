package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
//Clase del Registro de las plantas

public abstract class RegistroPlantas {
    private String NombreComun;
    private String NombreCientifico;
    private String Tipo;
    private String Requerimientos;
    private String CuidadosEspecificos;
    private Date fechaRiego;
    
    public interface CrecimientoPlanta {
        void actualizarCrecimientoPlanta();
    }
    // Constructor de la clase
    public RegistroPlantas(String NombreComun, String NombreCientifico, String Tipo, String Requerimientos,
            String CuidadosEspecificos) {
        this.NombreComun = NombreComun;
        this.NombreCientifico = NombreCientifico;
        this.Tipo = Tipo;
        this.Requerimientos = Requerimientos;
        this.CuidadosEspecificos = CuidadosEspecificos;
        this.fechaRiego = null;

    }

    public String getNombreComun() {
        return NombreComun;
    }

    public void setNombreComun(String nombreComun) {
        NombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        NombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public String getRequerimientos() {
        return Requerimientos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        CuidadosEspecificos = cuidadosEspecificos;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void setFechaRiego(Date fechaRiego) {
        this.fechaRiego = fechaRiego;
    }

    public Date getFechaRiego() {
        return fechaRiego;
    }

    // Método para mostrar la informacion de la planta
    public void mostrarPlanta() {
        System.out.println("Nombre comun: " + NombreComun);
        System.out.println("Nombre cientifico: " + NombreCientifico);
        System.out.println("Tipo: " + Tipo);
        System.out.println("Requerimientos: " + Requerimientos);
        System.out.println("Cuidados especificos: " + CuidadosEspecificos);

        if (fechaRiego != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha de riego: " + sdf.format(fechaRiego));
        } else {
            System.out.println("Fecha de riego: No asignada");
        }

    }
}
