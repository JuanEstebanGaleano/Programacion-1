package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProyectoVivero {
    public static void main(String[] args) {
        Planta rosa = new Rosa("Rosa común", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        rosa.setFechaRiego(new Date());

        BotanicoEspecializado botanico = new BotanicoEspecializado("Licencia1", "NombreBotanico", "ApellidoBotanico",
                "correo@example.com", "123456789");

        CuidadoPlanta cuidado = new CuidadoPlanta("Área1", new Date());

        botanico.agregarCuidado(cuidado);

        cuidado.registrarResultadoCuidado("Cuidado exitoso");

        List<CuidadoPlanta> cuidadosDelBotanico = botanico.obtenerCuidados();

        // Mostrar información de la planta
        System.out.println("Información de la planta:");
        System.out.println(rosa);

        // Mostrar información del botánico
        System.out.println("Información del botánico:");
        System.out.println(botanico);

        // Datos de cliente
        System.out.println("--------------------\n");
        Clientes cliente1 = new Clientes("Juan");
        cliente1.setAdquirirPlantas("Rosa");
        String adquirirPlantasCliente1 = cliente1.getAdquirirPlantas();
        String nombreCliente1 = cliente1.getNombre();
        Date fechaRegistroCliente1 = cliente1.getFechaRegistro();

        // Mostrar información del cuidado de la planta
        System.out.println("Información del cuidado de la planta:");
        System.out.println("Área de cuidado: " + cuidado.getAreaCuidado());
        System.out.println("Fecha y hora del cuidado: " + cuidado.getFechaHoraCuidado());
        System.out.println("Resultado del cuidado: " + cuidado.getResultadoCuidado());
        System.out.println("Estado del cuidado: " + cuidado.getEstadoCuidado());

        // Datos de Seguimiento de plantas
        CuidadoPlanta seguimiento1 = new CuidadoPlanta("Bueno", "Normal", "Abono");
        String herramientaUtilizada = seguimiento1.realizarSeguimiento();// Realizar el seguimiento de la planta
        System.out.println("Herramienta utilizada: " + herramientaUtilizada);

        // Imprimir Registro de clientes
        System.out.println("--------------------\n");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nombre del cliente: " + nombreCliente1);
        System.out.println("Planta Adquiririda: " + adquirirPlantasCliente1);
        System.out.println("Fecha de registro: " + sdf.format(fechaRegistroCliente1));
    }
}
