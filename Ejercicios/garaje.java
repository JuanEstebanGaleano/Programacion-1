
    // Definición de la clase Vehículo
public class garaje {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int año;

    // Constructor de la clase
    public garaje(String marca, String modelo, int año) {
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

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Vehículo
        garaje miVehículo = new garaje("Toyota", "Land Cruiser 300", 2023);

        // Obtener y mostrar la información del vehículo
        String informaciónVehículo = miVehículo.obtenerInformación();
        System.out.println("Información del Vehículo:\n" + informaciónVehículo);
    }
}


