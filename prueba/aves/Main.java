package aves;

public class Main {
    public static void main(String[] args) {
        Ave ave1 = new Ave();
        Ave aguila = new Aguila();
        Ave pinguino = new Pinguino();

        System.out.println("Método volar() de Ave:");
        ave1.volar();

        System.out.println("\nMétodo volar() de Aguila:");
        aguila.volar();

        System.out.println("\nMétodo volar() de Pinguino:");
        pinguino.volar();
    }
}
