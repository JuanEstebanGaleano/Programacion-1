// Definición de la clase Mascota
public class Mascota {
    // Atributos de la clase
    private String nombre;
    private String tipo;
    private int edad;

    // Constructor de la clase
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Método para obtener una descripción amigable de la mascota
    public String obtenerDescripción() {
        String descripción = "Nombre: " + nombre + "\n";
        descripción += "Tipo: " + tipo + "\n";
        descripción += "Edad: " + edad + " años";

        return descripción;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Mascota
        Mascota miMascota = new Mascota("Luna", "Perro", 3);

        // Obtener y mostrar la descripción de la mascota
        String descripciónMascota = miMascota.obtenerDescripción();
        System.out.println("Descripción de la Mascota:\n" + descripciónMascota);
    }
}
