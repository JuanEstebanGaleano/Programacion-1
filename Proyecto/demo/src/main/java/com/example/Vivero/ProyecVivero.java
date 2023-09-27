package com.example.Vivero;
public class ProyecVivero {
    public static void main(String[] args) {
        // Crear una instancia de Planta
        Planta planta1 = new Planta("Orquídea", "Phalaenopsis", "Flor", "Luz indirecta", "Riego semanal");

        // Imprimir los detalles de la planta
        planta1.imprimirDetalles();

        System.out.println("--------------------");
        Cliente cliente1 = new Cliente("John Doe");

        // Adquirir la planta para el cliente
        cliente1.adquirirPlanta(planta1);

        // Imprimir las plantas adquiridas por el cliente
        cliente1.imprimirPlantasAdquiridas();
    }
}