package com.example;


public abstract class figura {
    protected double posX;
    protected double posY;

    public figura(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public abstract double calcularArea();
}
