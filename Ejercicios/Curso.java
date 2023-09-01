// Definición de la clase Curso
public class Curso {
    // Atributos de la clase
    private String nombre;
    private String profesorEncargado;
    private int duracionEnHoras;

    // Constructor de la clase
    public Curso(String nombre, String profesorEncargado, int duracionEnHoras) {
        this.nombre = nombre;
        this.profesorEncargado = profesorEncargado;
        this.duracionEnHoras = duracionEnHoras;
    }

    // Método para obtener un resumen del curso
    public String obtenerResumen() {
        String resumen = "Curso: " + nombre + "\n";
        resumen += "Profesor: " + profesorEncargado + "\n";
        resumen += "Duración: " + duracionEnHoras + " horas";

        return resumen;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Curso
        Curso miCurso = new Curso("Programación Java", "Soraya Gonzalez", 30);

        // Obtener y mostrar el resumen del curso
        String resumenCurso = miCurso.obtenerResumen();
        System.out.println("Resumen del Curso:\n" + resumenCurso);
    }
}
