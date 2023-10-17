package juguetes;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases pelota y muñeca
      Muñeca muñeca = new Muñeca();
      Pelota pelota = new Pelota();
      
      // Utilizar las herramientas
      muñeca.jugar("para jugar con niñas y niños");
      pelota.jugar("para jugar partidos, voleyball");
    }
}
