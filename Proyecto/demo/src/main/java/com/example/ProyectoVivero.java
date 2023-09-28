package com.example;

import javax.swing.JOptionPane;

public class RegistroPlantas {
    private String NombreComun;
    private String NombreCientifico;
    private String Tipo;
    private String Requerimientos;
    private String CuidadosEspecificos;

    // Constructor de la clase
    public RegistroPlantas(String NombreComun, String NombreCientifico, String Tipo, String Requerimientos,
            String CuidadosEspecificos) {
        this.NombreComun = NombreComun;
        this.NombreCientifico = NombreCientifico;
        this.Tipo = Tipo;
        this.Requerimientos = Requerimientos;
        this.CuidadosEspecificos = CuidadosEspecificos;
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

    // Método para mostrar la informacion de la planta
    public void mostrarPlanta() {
        System.out.println("Nombre comun: " + NombreComun);
        System.out.println("Nombre cientifico: " + NombreCientifico);
        System.out.println("Tipo: " + Tipo);
        System.out.println("Requerimientos: " + Requerimientos);
        System.out.println("Cuidados especificos: " + CuidadosEspecificos);
    }
}
// Clase de seguimiento para las plantas
public class SeguimientoPlantas {
    private String SeguimientoDelEstadoSalud;
    private String SeguimientoDelCrecimiento;
    private String Herramientas;
    public int seg;

    public String getSeguimientoDelEstadoSalud() {
        return SeguimientoDelEstadoSalud;
    }

    public void setSeguimientoDelEstadoSalud(String seguimientoDelEstadoSalud) {
        SeguimientoDelEstadoSalud = seguimientoDelEstadoSalud;
    }

    public String getSeguimientoDelCrecimiento() {
        return SeguimientoDelCrecimiento;
    }

    public void setSeguimientoDelCrecimiento(String seguimientoDelCrecimiento) {
        SeguimientoDelCrecimiento = seguimientoDelCrecimiento;
    }

    public String getHerramientas() {
        return Herramientas;
    }

    public void setHerramientas(String herramientas) {
        Herramientas = herramientas;
    }

    public void realizarSeguimiento() {
        seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de herramienta que utilizará"));
        switch (seg) {
            case 1:
                JOptionPane.showMessageDialog(null, "Abono");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fechas de riego");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Trasplantes");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Herramienta no reconocida");
        }
    }
}
// Clase de los clientes
public class Clientes {
    private String adquirirPlantas;
    private String Preferencias;
    private String Recordatorios;
    private String AprenderPlantas;

    public String getAdquirirPlantas() {
        return adquirirPlantas;
    }

    public void setAdquirirPlantas(String adquirirPlantas) {
        this.adquirirPlantas = adquirirPlantas;
    }

    public String getAprenderPlantas() {
        return AprenderPlantas;
    }

    public void setAprenderPlantas(String aprenderPlantas) {
        AprenderPlantas = aprenderPlantas;
    }

    public String getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(String preferencias) {
        Preferencias = preferencias;
    }

    public String getRecordatorios() {
        return Recordatorios;
    }

    public void setRecordatorios(String recordatorios) {
        Recordatorios = recordatorios;
    }

}