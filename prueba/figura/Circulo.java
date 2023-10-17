package figura;

class Circulo extends Forma {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Implementación del método para calcular el área
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}