package imprimirFotos;

class Documento implements Imprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
    }
}
