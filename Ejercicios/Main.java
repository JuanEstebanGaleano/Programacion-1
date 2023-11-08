package com.example;


public class Main {
 
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(2.0, 3.0, 4.0);
        
        double areaCuadrado = cuadrado.calcularArea();
        System.out.println("Área del cuadrado: " + areaCuadrado);
        
        circulo circulo = new circulo(5.0, 5.0, 2.0);
        
        double areaCirculo = circulo.calcularArea();
        System.out.println("Área del círculo: " + areaCirculo);
    }
}