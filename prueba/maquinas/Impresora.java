package maquinas;

// Clase Impresora que implementa la interfaz Maquina
class Impresora implements Maquina {
    @Override
    public void operar() {
        System.out.println("La impresora está imprimiendo un documento.");
    }
}