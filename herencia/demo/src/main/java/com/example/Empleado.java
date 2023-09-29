package herencia.demo.src.main.java.com.example;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado=++contadorEmpleado;
        this.sueldo=sueldo;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

   public double getSueldo() {
       return sueldo;
   }
   public void setSueldo(double sueldo) {
       this.sueldo = sueldo;
   }
   public static int getContadorEmpleado() {
       return contadorEmpleado;
   }
   
   public String toString(){
    return super.toString()+ "Empleado"+ idEmpleado+ "Sueldo ="+sueldo;
   }
}
