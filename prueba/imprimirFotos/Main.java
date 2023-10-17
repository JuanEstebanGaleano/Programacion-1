package imprimirFotos;

interface Imprimible {
    void imprimir();
}
 
public class Main {
    public static void main(String[] args) {
        Documento miDocumento = new Documento();
        Foto miFoto = new Foto();
        
        miDocumento.imprimir(); // Imprime "Imprimiendo documento..."
        miFoto.imprimir();      // Imprime "Imprimiendo foto..."
    }
 }
  

   
 
