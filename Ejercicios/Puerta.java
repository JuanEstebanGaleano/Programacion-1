public class Puerta {
    private boolean abierta;

    // Constructor para inicializar el estado de la puerta
    public Puerta(boolean abierta) {
        this.abierta = abierta;
    }

    // Método para abrir la puerta
    public void abrir() {
        abierta = true;
    }

    // Método para cerrar la puerta
    public void cerrar() {
        abierta = false;
    }

    // Método para mostrar el estado de la puerta
    public void mostrarEstado() {
        if (abierta) {
            System.out.println("La puerta está abierta.");
        } else {
            System.out.println("La puerta está cerrada.");
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de Puerta inicialmente cerrada
        Puerta miPuerta = new Puerta(false);

        // Mostrar el estado inicial de la puerta
        miPuerta.mostrarEstado();

        // Abrir la puerta y mostrar el estado
        miPuerta.abrir();
        miPuerta.mostrarEstado();

        // Cerrar la puerta y mostrar el estado
        miPuerta.cerrar();
        miPuerta.mostrarEstado();
    }
}
