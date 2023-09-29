package herencia.demo.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
       Empleado empleado1=new Empleado(null, 0);
       empleado1.setEdad(28);
       empleado1.setGenero('M');
       empleado1.setDireccion(null);
       System.out.println(empleado1);

       Cliente cliente1= new Cliente(new Date(), true);
    cliente1.setNombre("Juan");
    System.out.println(cliente1);
    }
}