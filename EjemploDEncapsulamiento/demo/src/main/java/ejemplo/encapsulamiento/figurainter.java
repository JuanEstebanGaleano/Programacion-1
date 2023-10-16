package EjemploDEncapsulamiento.demo.src.main.java.ejemplo.encapsulamiento;

public class figurainter {
    
}

public interface figurac {
           double calcularArea();

}
    public interface Rotable {
        void rotar(double angulo);
    }
    
    public interface Dibujable {
        void dibujar();
    }
public class Cuadrado implements Figura, Rotable, Dibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void rotar(double angulo) {
        System.out.println("Rotando el cuadrado en " + angulo + " grados");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

public class Circulo implements Figura, Rotable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void rotar(double angulo) {
        System.out.println("Rotando el círculo en " + angulo + " grados");
    }
}