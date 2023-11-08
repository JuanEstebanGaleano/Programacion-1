package com.example;
public class circulo extends figura {
    private double radio;
    
    public circulo(double posX, double posY, double radio) {
        super(posX, posY);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
