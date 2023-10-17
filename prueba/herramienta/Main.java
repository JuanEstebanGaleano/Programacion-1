package herramienta;

public class Main {
    public static void main(String[] args) {
       // Crear objetos de las clases Sierra y Martillo
      Sierra sierra = new Sierra();
      Martillo martillo = new Martillo();
      
      // Utilizar las herramientas
      sierra.usar("para cortar");
      martillo.usar("para clavar un tornillo");
    }
      
  }

