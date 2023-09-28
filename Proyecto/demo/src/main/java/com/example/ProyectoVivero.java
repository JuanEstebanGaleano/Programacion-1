//Autor: Juan Esteban Galeano Bolaños
package com.example;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

//Clase del Registro de las plantas
class RegistroPlantas {
    private String NombreComun;
    private String NombreCientifico;
    private String Tipo;
    private String Requerimientos;
    private String CuidadosEspecificos;
    private Date fechaRiego;

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

// Clase de Seguimiento de las plantas
class SeguimientoPlantas {
    private String SeguimientoDelEstadoSalud;
    private String SeguimientoDelCrecimiento;
    private String Herramientas;
    public int seg;

    // Constructor de la clase
    public SeguimientoPlantas(String SeguimientoDelEstadoSalud, String SeguimientoDelCrecimiento, String Herramientas) {
        this.SeguimientoDelEstadoSalud = SeguimientoDelEstadoSalud;
        this.SeguimientoDelCrecimiento = SeguimientoDelCrecimiento;
        this.Herramientas = Herramientas;
    }

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

    // Seguimiento de la planta
    public String realizarSeguimiento() {
        String herramientaUtilizada;
        seg = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de herramienta que utilizará"));
        switch (seg) {
            case 1:
                herramientaUtilizada = "Abono";
                break;
            case 2:
                herramientaUtilizada = "Fechas de riego";
                break;
            case 3:
                herramientaUtilizada = "Trasplantes";
                break;
            default:
                herramientaUtilizada = "Herramienta no reconocida";
        }
        return herramientaUtilizada;
    }

    // Método para mostrar la informacion del seguimiento de la planta
    public void mostrarSeguimiento() {
        System.out.println("Seguimiento del estado de salud: " + SeguimientoDelEstadoSalud);
        System.out.println("Seguimiento del crecimiento: " + SeguimientoDelCrecimiento);
    }
}

// Clase de clientes
class Clientes {
    private String adquirirPlantas;
    private String Preferencias;
    private String Recordatorios;
    private String AprenderPlantas;
    private String nombre;
    private Date fechaRegistro;

    // Constructor de la clase
    public Clientes(String nombre) {
        this.nombre = nombre;
        this.fechaRegistro = new Date(); // Registra la fecha actual al crear un cliente
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

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

public class ProyectoVivero {
    public static void main(String[] args) {
        // Datos de plantas
        RegistroPlantas planta1 = new RegistroPlantas("Rosa", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        String nombreComunPlanta1 = planta1.getNombreComun(); // Obtener el nombre común de la planta
        planta1.setNombreComun("Nueva Rosa"); // Establecer un nuevo nombre común para la planta
        planta1.setFechaRiego(new Date()); // Establecer la fecha de riego actual

        // Datos de cliente
        System.out.println("--------------------\n");
        Clientes cliente1 = new Clientes("Juan");
        cliente1.setAdquirirPlantas("Rosa");
        String adquirirPlantasCliente1 = cliente1.getAdquirirPlantas();
        String nombreCliente1 = cliente1.getNombre();
        Date fechaRegistroCliente1 = cliente1.getFechaRegistro();

        // Datos de Seguimiento de plantas
        SeguimientoPlantas seguimiento1 = new SeguimientoPlantas("Bueno", "Normal", "Abono");
        String herramientaUtilizada = seguimiento1.realizarSeguimiento();// Realizar el seguimiento de la planta

        // Imprimir Informacion de la planta
        System.out.println("Información de la planta: ");
        planta1.mostrarPlanta();
        System.out.println("--------------------\n");
        System.out.println("El seguimiento de la planta: ");
        seguimiento1.mostrarSeguimiento();
        System.out.println("Herramienta utilizada: " + herramientaUtilizada);

        // Imprimir Registro de clientes
        System.out.println("--------------------\n");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nombre del cliente: " + nombreCliente1);
        System.out.println("Planta Adquiririda : " + adquirirPlantasCliente1);
        System.out.println("Fecha de registro: " + sdf.format(fechaRegistroCliente1));
    }

}
