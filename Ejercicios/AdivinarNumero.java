import java.util.Scanner;
/*
 * Pedirle al usuario que ingrese un número y lo haremos hasta que 
 * ingrese el número que queremos, en este caso 5
 */
public class AdivinarNumero {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int numero;
        do {
            System.out.println("Ingrese el número 5");
            numero= scanner.nextInt();
        } while (numero!=5);
        System.out.println("!Correcto!"+" Has ingresado el número " +numero);
    }
    }
}
