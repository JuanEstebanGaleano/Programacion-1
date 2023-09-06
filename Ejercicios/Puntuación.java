// Definición de la clase Puntuación
public class Puntuación {
    // Atributos de la clase
    private String nombreJugador;
    private int puntuaciónActual;

    // Constructor de la clase
    public Puntuación(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.puntuaciónActual = 0;
    }

    // Método para incrementar la puntuación
    public void incrementarPuntuación(int puntos) {
        if (puntos > 0) {
            puntuaciónActual += puntos;
            System.out.println("Puntuación incrementada en " + puntos + " puntos.");
        } else {
            System.out.println("Los puntos a incrementar deben ser mayores que cero.");
        }
    }

    // Método para reducir la puntuación
    public void reducirPuntuación(int puntos) {
        if (puntos > 0 && puntos <= puntuaciónActual) {
            puntuaciónActual -= puntos;
            System.out.println("Puntuación reducida en " + puntos + " puntos.");
        } else {
            System.out.println("Los puntos a reducir deben ser mayores que cero y no superar la puntuación actual.");
        }
    }

    // Método para obtener la puntuación actual
    public int obtenerPuntuaciónActual() {
        return puntuaciónActual;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Puntuación
        Puntuación miPuntuación = new Puntuación("Jugador1");

        // Incrementar y reducir la puntuación
        miPuntuación.incrementarPuntuación(50);
        miPuntuación.reducirPuntuación(20);

        // Obtener y mostrar la puntuación actual
        int puntuaciónActual = miPuntuación.obtenerPuntuaciónActual();
        System.out.println("Puntuación Actual: " + puntuaciónActual);
    }
}

