package Proyecto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase para representar una planta
class Planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientosLuz;
    private String requerimientosAgua;
    // Constructor
    public Planta(String nombreComun, String nombreCientifico, String tipo, String requerimientosLuz, String requerimientosAgua) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientosLuz = requerimientosLuz;
        this.requerimientosAgua = requerimientosAgua;
    }

    // Métodos getters y setters
    public String toString() {
    return "Nombre Común: " + nombreComun + ", Nombre Científico: " + nombreCientifico;
    }

    
}

// Clase para representar un cliente
class Cliente {
    private String nombre;
    private String correo;
    private List<Planta> plantasAdquiridas;

    // Constructor
    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.plantasAdquiridas = new ArrayList<>();
    }
    // Método para agregar una planta adquirida por el cliente
    public void agregarPlantaAdquirida(Planta planta) {
        plantasAdquiridas.add(planta);
    }

    // Método para obtener las plantas adquiridas por el cliente
    public List<Planta> getPlantasAdquiridas() {
        return plantasAdquiridas;
    }
}
// Clase para representar un registro de cuidado de una planta
class RegistroCuidado {
    private Planta planta;
    private Date fecha;
    private String tipoCuidado;

    // Constructor
    public RegistroCuidado(Planta planta, Date fecha, String tipoCuidado) {
        this.planta = planta;
        this.fecha = fecha;
        this.tipoCuidado = tipoCuidado;
    }
}

// Clase principal
public class ProyectoVivero {
    public static void main(String[] args) {
        Planta planta1 = new Planta("Rosa", "Rosa sp.", "Arbusto", "Luz directa", "Riego regular");
        Planta planta2 = new Planta("Cactus", "Cactaceae", "Suculenta", "Luz intensa", "Riego ocasional");

        Cliente cliente1 = new Cliente("Juan", "juan@example.com");
        cliente1.agregarPlantaAdquirida(planta1);

        // Imprimir información
        System.out.println("Información de la planta 1: " + planta1);
        System.out.println("Información del cliente 1: " + cliente1.getPlantasAdquiridas());
    }
}
