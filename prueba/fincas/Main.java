package fincas;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial("Juan", 20, 15);
        EmpleadoRecoleccion empleadoRecoleccion = new EmpleadoRecoleccion("Maria", 100, 2);

        // Crear una finca
        Finca finca = new Finca("Mi Finca");

        // Asignar empleados a la finca
        finca.adicionarEmpleado(empleadoTiempoParcial);
        System.out.println("Empleado asignado a la finca: " + empleadoTiempoParcial.getNombre());

        finca.adicionarEmpleado(empleadoRecoleccion);
        System.out.println("Empleado asignado a la finca: " + empleadoRecoleccion.getNombre());

        // Obtener detalles del empleado actual
        System.out.println(finca.obtenerDetallesEmpleado());

        // Calcular salario total de la finca
        double salarioTotal = finca.calcularSalarioTotal();
        System.out.println("Salario total de la finca: $" + salarioTotal);

        // Comprobar si el empleado actual es de tiempo parcial
        if (finca.esEmpleadoTiempoParcial()) {
            System.out.println("El empleado actual es de tiempo parcial.");
        } else {
            System.out.println("El empleado actual no es de tiempo parcial.");
        }

        // Actualizar detalles específicos
        empleadoTiempoParcial.setNumeroHoras(30);
        empleadoRecoleccion.setNumeroKilos(150);

        // Actualizar tarifa por hora y valor por kilo
        empleadoTiempoParcial.actualizarTarifaHora(18);
        empleadoRecoleccion.actualizarValorKilo(3);

        // Imprimir resumen de actividades
        System.out.println(empleadoTiempoParcial.obtenerResumen());
        System.out.println(empleadoRecoleccion.obtenerResumen());

        // Eliminar empleado de la finca
        finca.eliminarEmpleado();
        System.out.println("Empleado eliminado de la finca.");

        // Verificar si hay empleado asignado a la finca
        System.out.println(finca.obtenerDetallesEmpleado());
    }
}
