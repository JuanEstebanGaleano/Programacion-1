package com.example;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Planta> plantasAdquiridas;

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.plantasAdquiridas = new ArrayList<>();
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Planta> getPlantasAdquiridas() {
        return plantasAdquiridas;
    }

    // Método para adquirir una planta
    public void adquirirPlanta(Planta planta) {
        plantasAdquiridas.add(planta);
    }

    // Método para imprimir las plantas adquiridas por el cliente
    public void imprimirPlantasAdquiridas() {
        System.out.println("Plantas adquiridas por " + nombre + ":");
        for (Planta planta : plantasAdquiridas) {
            planta.imprimirDetalles();
            System.out.println("--------------------");
        }
    }
}