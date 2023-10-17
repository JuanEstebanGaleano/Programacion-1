package aves;

// Clase Pinguino, que hereda de Ave
class Pinguino extends Ave {
    @Override
    public void volar() {
        System.out.println("Los pingüinos no pueden volar, ellos nadan en lugar de volar.");
    }
}