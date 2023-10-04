//Autor: Juan Esteban Galeano Bolaños
package com.example;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ProyectoVivero {
    public static void main(String[] args) {
        // Datos de plantas
        RegistroPlantas planta1 = new RegistroPlantas("Rosa", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        String nombreComunPlanta1 = planta1.getNombreComun(); // Obtener el nombre común de la planta
        planta1.setNombreComun("Nueva Rosa"); // Nuevo nombre común para la planta
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
        System.out.println("Planta Adquiririda: " + adquirirPlantasCliente1);
        System.out.println("Fecha de registro: " + sdf.format(fechaRegistroCliente1));
    }

}
