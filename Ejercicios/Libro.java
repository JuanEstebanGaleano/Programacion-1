// Definición de la clase Libro
public class Libro {
    // Atributos de la clase
    private String título;
    private String autor;
    private int númeroDePáginas;

    // Constructor de la clase
    public Libro(String título, String autor, int númeroDePáginas) {
        this.título = título;
        this.autor = autor;
        this.númeroDePáginas = númeroDePáginas;
    }

    // Método para mostrar un resumen del libro
    public void mostrarResumen() {
        System.out.println("Título: " + título);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + númeroDePáginas);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Libro
        Libro miLibro = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 218);

        // Mostrar el resumen del libro
        System.out.println("Resumen del Libro:");
        miLibro.mostrarResumen();
    }
}
