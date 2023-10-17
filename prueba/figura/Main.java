package figura;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        System.out.println("Círculo - Color: " + circulo.getColor());
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());

        System.out.println("Rectángulo - Color: " + rectangulo.getColor());
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
    }
}
