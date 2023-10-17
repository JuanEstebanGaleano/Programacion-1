package zapatos;

public class Main {
    public static void main(String[] args) {
        Zapato zapatoGenerico = new Zapato();
        Deportivo zapatoDeportivo = new Deportivo();
        Formal zapatoFormal = new Formal();

        System.out.println("Características de diferentes zapatos:");
        zapatoGenerico.caracteristica();
        zapatoDeportivo.caracteristica();
        zapatoFormal.caracteristica();
    }
}
