package elementos;

public class Main {
    public static void main(String[] args) {
        Elemento elementoDesconocido = new Elemento();
        Agua agua = new Agua();
        Helio helio = new Helio();

        System.out.print("Elemento desconocido: ");
        elementoDesconocido.estado();

        System.out.print("Agua: ");
        agua.estado();

        System.out.print("Helio: ");
        helio.estado();
    }
}
