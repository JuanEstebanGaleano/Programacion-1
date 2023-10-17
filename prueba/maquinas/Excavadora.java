package maquinas;

// Clase Excavadora que implementa la interfaz Maquina
class Excavadora implements Maquina {
    @Override
    public void operar() {
        System.out.println("La excavadora está excavando terreno.");
    }
}
