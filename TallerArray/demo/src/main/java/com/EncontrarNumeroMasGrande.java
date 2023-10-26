//Dado un ArrayList de números enteros, encontrar e imprimir el número más grande.
package TallerArray.demo.src.main.java.com;

import java.util.ArrayList;

public class EncontrarNumeroMasGrande {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(21);
        numeros.add(3);
        
        int numeroMasGrande = numeros.get(0); 

        // Recorrer la lista para encontrar el número más grande
        for (int i = 1; i < numeros.size(); i++) {
            int numeroActual = numeros.get(i);
            if (numeroActual > numeroMasGrande) {
                numeroMasGrande = numeroActual;
            }
        }

        // Imprimir el número más grande
        System.out.println("El número más grande es: " + numeroMasGrande);
    }
}