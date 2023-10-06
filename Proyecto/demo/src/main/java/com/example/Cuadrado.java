package com.example;
public class Cuadrado extends figura {
    private double lado;
    
    public Cuadrado(double posX, double posY, double lado) {
        super(posX, posY);
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}