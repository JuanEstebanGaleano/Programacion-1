package imprimirFotos;

// Clase Foto que implementa la interfaz Imprimible
class Foto implements Imprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo foto...");
    }
}
