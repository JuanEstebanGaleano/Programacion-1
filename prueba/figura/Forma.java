package figura;

abstract class Forma {

    private String color;

    // Constructor
    public Forma(String color) {
        this.color = color;
    }

    // Método abstracto para calcular el área
    public abstract double area();

    // Método abstracto para calcular el perímetro
    public abstract double perimetro();

    // Getter para obtener el color
    public String getColor() {
        return color;
    }
    
}
