package muebles;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases Sofa y Mesa
        Sofa sofa = new Sofa();
        Mesa mesa = new Mesa();
        
        // Colocar los muebles en diferentes ubicaciones
        sofa.ubicar("la sala de estar");
        mesa.ubicar("el comedor");
    }
}
