// Definición de la clase Estudiante
public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private String grado;
    private double promedio;

    // Constructor de la clase
    public Estudiante(String nombre, String grado, double promedio) {
        this.nombre = nombre;
        this.grado = grado;
        this.promedio = promedio;
    }

    // Método para determinar si el estudiante ha aprobado
    public boolean haAprobado() {
        return promedio > 6.0;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Estudiante
        Estudiante miEstudiante = new Estudiante("Juan Pérez", "Noveno Grado", 7.8);

        // Determinar y mostrar si el estudiante ha aprobado
        boolean aprobado = miEstudiante.haAprobado();
        System.out.println("El estudiante ha aprobado: " + aprobado);
    }
}
