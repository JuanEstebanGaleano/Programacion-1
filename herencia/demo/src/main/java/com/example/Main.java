package herencia.demo.src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
       Empleado empleado1=new Empleado(null, 0);
       empleado1.setEdad(0);
       empleado1.setGenero(0);
       empleado1.setDireccion(null);
       System.out.println(empleado1);

       Cliente cliente1= new Cliente();
       
    }
}