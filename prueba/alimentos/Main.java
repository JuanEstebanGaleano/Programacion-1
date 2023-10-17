package alimentos;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de Fruta y Carne
        Fruta manzana = new Fruta("Manzana", 52, "Fruta fresca");
        Carne pollo = new Carne("Pollo", 165, "Aves de corral");

        // Mostrar nutrientes de los alimentos
        System.out.println("Información de la Manzana:");
        System.out.println("Nombre: " + manzana.getNombre());
        System.out.println("Calorías: " + manzana.getCalorias());
        manzana.describirNutrientes();

        System.out.println("\nInformación del Pollo:");
        System.out.println("Nombre: " + pollo.getNombre());
        System.out.println("Calorías: " + pollo.getCalorias());
        pollo.describirNutrientes();
    }
}
