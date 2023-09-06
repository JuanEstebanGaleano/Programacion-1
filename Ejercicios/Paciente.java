// Definición de la clase Paciente
public class Paciente {
    // Atributos de la clase
    private String nombre;
    private int numeroDePaciente;
    private String diagnostico;

    // Constructor de la clase
    public Paciente(String nombre, int numeroDePaciente, String diagnostico) {
        this.nombre = nombre;
        this.numeroDePaciente = numeroDePaciente;
        this.diagnostico = diagnostico;
    }

    // Método para obtener la información del paciente
    public String obtenerInformación() {
        String información = "Nombre: " + nombre + "\n";
        información += "Número de Paciente: " + numeroDePaciente + "\n";
        información += "Diagnóstico: " + diagnostico;

        return información;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Paciente
        Paciente miPaciente = new Paciente("Juan Pérez", 12345, "Fiebre");

        // Obtener y mostrar la información del paciente
        String informaciónPaciente = miPaciente.obtenerInformación();
        System.out.println("Información del Paciente:\n" + informaciónPaciente);
    }
}

