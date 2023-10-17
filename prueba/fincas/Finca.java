package fincas;

// Clase Finca
class Finca {
    private String nombre;
    private Empleado empleado;

    public Finca(String nombre) {
        this.nombre = nombre;
    }

    public void adicionarEmpleado(Empleado empleado) {
        if (this.empleado == null) {
            this.empleado = empleado;
        } else {
            System.out.println("El empleado ya existe.");
        }
    }

    public String obtenerDetallesEmpleado() {
        if (empleado != null) {
            return "Empleado actual en la finca: " + empleado.getNombre() + " (" + empleado.getCargo() + ")";
        } else {
            return "No hay empleado asignado a la finca.";
        }
    }

    public void eliminarEmpleado() {
        empleado = null;
    }

    public double calcularSalarioTotal() {
        if (empleado != null) {
            return empleado.calcularSalario();
        }
        return 0;
    }

    public boolean esEmpleadoTiempoParcial() {
        return empleado instanceof EmpleadoTiempoParcial;
    }
}