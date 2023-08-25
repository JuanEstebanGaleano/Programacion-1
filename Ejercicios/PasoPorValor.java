public class PasoPorValor {
    public static void modificarValor(int numero){
        numero=100;
        System.out.println("Valor dentro del metodo "+ numero);
    }
    public static void main(String[] args) {
        int valor=50;
        System.out.println("Valor antes de llamar al método "+ valor);

        modificarValor(valor);
        System.out.println("Valor despues de llamar al método "+ valor);
    }
}
