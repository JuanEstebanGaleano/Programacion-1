public class ContarVocales {
    public static void main(String[] args) {
        String cad = "YourStringHere";
        int vocales = contarVocales(cad);
        System.out.println("Número de vocales: " + vocales);
    }

    public static int contarVocales(String cad) {
        int vocales = 0;
        for (int i = 0; i < cad.length(); i++) {
            char c = Character.toLowerCase(cad.charAt(i)); 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
}
