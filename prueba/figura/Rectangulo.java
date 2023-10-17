package figura;

// Clase Rectangulo que hereda de Forma
class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método para calcular el área
    @Override
    public double area() {
        return largo * ancho;
    }

    // Implementación del método para calcular el perímetro
    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }
}