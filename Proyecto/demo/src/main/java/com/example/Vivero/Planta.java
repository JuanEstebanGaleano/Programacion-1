package com.example.Vivero;

public class Planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientosLuz;
    private String requerimientosAgua;

    // Constructor
    public Planta(String nombreComun, String nombreCientifico, String tipo, String requerimientosLuz, String requerimientosAgua) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientosLuz = requerimientosLuz;
        this.requerimientosAgua = requerimientosAgua;
    }

    // Getters y Setters
    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRequerimientosLuz() {
        return requerimientosLuz;
    }

    public void setRequerimientosLuz(String requerimientosLuz) {
        this.requerimientosLuz = requerimientosLuz;
    }

    public String getRequerimientosAgua() {
        return requerimientosAgua;
    }

    public void setRequerimientosAgua(String requerimientosAgua) {
        this.requerimientosAgua = requerimientosAgua;
    }

    // Método para imprimir los detalles de la planta
    public void imprimirDetalles() {
        System.out.println("Nombre común: " + nombreComun);
        System.out.println("Nombre científico: " + nombreCientifico);
        System.out.println("Tipo: " + tipo);
        System.out.println("Requerimientos de luz: " + requerimientosLuz);
        System.out.println("Requerimientos de agua: " + requerimientosAgua);
    }
}