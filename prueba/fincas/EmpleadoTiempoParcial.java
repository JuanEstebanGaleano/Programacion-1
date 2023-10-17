package fincas;

// Subclase EmpleadoTiempoParcial
class EmpleadoTiempoParcial extends Empleado {
    private int numeroHoras;
    private int salarioHora;

    public EmpleadoTiempoParcial(String nombre, int numeroHoras, int salarioHora) {
        super(nombre, "Tiempo Parcial");
        this.numeroHoras = numeroHoras;
        this.salarioHora = salarioHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public double calcularSalario() {
        return numeroHoras * salarioHora;
    }

    public String obtenerResumen() {
        return "Empleado de Tiempo Parcial: Nombre: " + getNombre() + ", Horas Trabajadas: " + numeroHoras;
    }
    
    public void actualizarTarifaHora(int nuevaTarifa) {
        salarioHora = nuevaTarifa;
    }
}