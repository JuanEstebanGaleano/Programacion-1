package com.example.Vivero;
public class ProyecVivero {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Orquídea", "Phalaenopsis", "Flor", "Luz indirecta", "Riego semanal\n");

        // Imprimir los detalles de la planta
        planta1.imprimirDetalles();

        System.out.println("--------------------\n");
        Cliente cliente1 = new Cliente("Juan Esteban");

        // Adquirir la planta para el cliente
        cliente1.adquirirPlanta(planta1);

        // Imprimir las plantas adquiridas por el cliente
        cliente1.imprimirPlantasAdquiridas();
    }
}