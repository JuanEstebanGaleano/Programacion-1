package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase para representar una planta
class ClasePlanta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientosLuz;
    private String requerimientosAgua;

    // Constructor
    public ClasePlanta(String nombreComun, String nombreCientifico, String tipo, String requerimientosLuz,
            String requerimientosAgua) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientosLuz = requerimientosLuz;
        this.requerimientosAgua = requerimientosAgua;
    }

    // Métodos getters y setters para nombreComun
    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    // Métodos getters y setters para nombreCientifico
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    // Métodos getters y setters para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos getters y setters para requerimientosLuz
    public String getRequerimientosLuz() {
        return requerimientosLuz;
    }

    public void setRequerimientosLuz(String requerimientosLuz) {
        this.requerimientosLuz = requerimientosLuz;
    }

    // Métodos getters y setters para requerimientosAgua
    public String getRequerimientosAgua() {
        return requerimientosAgua;
    }

    public void setRequerimientosAgua(String requerimientosAgua) {
        this.requerimientosAgua = requerimientosAgua;
    }

    public String toString() {
        return "Nombre común: " + nombreComun + ", Nombre científico: " + nombreCientifico;
    }
}

class Cliente {
    // Clase para representar un cliente
    private String nombre;
    private String correo;
    private List<ClasePlanta> plantasAdquiridas;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.plantasAdquiridas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void agregarPlantaAdquirida(ClasePlanta planta) {
        plantasAdquiridas.add(planta);
    }

    public List<ClasePlanta> getPlantasAdquiridas() {
        return plantasAdquiridas;
    }
}

class RegistroCuidado {

    // Clase para representar un registro de cuidado de una planta
    private ClasePlanta planta;
    private Date fecha;
    private String tipoCuidado;

    public RegistroCuidado() {
    }

    public ClasePlanta getPlanta() {
        return planta;
    }

    public void setPlanta(ClasePlanta planta) {
        this.planta = planta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }
}

public class ProyectoVivero {
    public static void main(String[] args) {

        ClasePlanta planta1 = new ClasePlanta("Rosa", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        String nombreComunPlanta1 = planta1.getNombreComun(); // Obtener el nombre común de la planta
        planta1.setNombreComun("Nueva Rosa"); // Establecer un nuevo nombre común para la planta

        Cliente cliente1 = new Cliente("Juan", "juan@example.com");
        String nombreCliente1 = cliente1.getNombre(); // Obtener el nombre del cliente
        cliente1.setNombre("Nuevo Juan"); // Establecer un nuevo nombre para el cliente

        System.out.println("Información de la planta 1: " + planta1);
        System.out.println("Información del cliente 1: " + nombreCliente1);
    }
}
