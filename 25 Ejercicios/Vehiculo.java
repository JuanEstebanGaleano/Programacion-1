// Definición de la clase Vehículo
public class Vehiculo {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int año;

    // Constructor de la clase
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para obtener la información del vehículo en formato amigable
    public String obtenerInformación() {
        // Construir la cadena de información
        String información = "Marca: " + marca + "\n";
        información += "Modelo: " + modelo + "\n";
        información += "Año: " + año;

        return información;
    }

    public static void main(String[] args) {
        // Crear una instancia de Vehículo
        Vehiculo miVehículo = new Vehiculo("Toyota", "Corolla", 2023);

        // Obtener y mostrar la información del vehículo
        String informaciónVehículo = miVehículo.obtenerInformación();
        System.out.println("Información del Vehículo:\n" + informaciónVehículo);
    }
}