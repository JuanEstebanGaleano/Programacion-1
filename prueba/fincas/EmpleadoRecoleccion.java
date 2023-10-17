package fincas;

// Subclase EmpleadoRecoleccion
class EmpleadoRecoleccion extends Empleado {
    private int numeroKilos;
    private int valorKilo;

    public EmpleadoRecoleccion(String nombre, int numeroKilos, int valorKilo) {
        super(nombre, "Recolección");
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;
    }

    public int getNumeroKilos() {
        return numeroKilos;
    }

    public void setNumeroKilos(int numeroKilos) {
        this.numeroKilos = numeroKilos;
    }

    public int getValorKilo() {
        return valorKilo;
    }

    public void setValorKilo(int valorKilo) {
        this.valorKilo = valorKilo;
    }

    @Override
    public double calcularSalario() {
        return numeroKilos * valorKilo;
    }

    public String obtenerResumen() {
        return "Empleado de Recolección: Nombre: " + getNombre() + ", Kilos Recolectados: " + numeroKilos;
    }
    
    public void actualizarValorKilo(int nuevoValor) {
        valorKilo = nuevoValor;
    }
}