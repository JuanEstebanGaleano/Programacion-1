package maquinas;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Excavadora y operarla
        Excavadora excavadora = new Excavadora();
        excavadora.operar();
        
        // Crear una instancia de Impresora y operarla
        Impresora impresora = new Impresora();
        impresora.operar();
    }
}
