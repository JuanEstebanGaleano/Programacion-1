package celular;
public class Dispositivos {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivos(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

        public static void main(String[] args) {
            Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 999.99, "Android");
            Ordenador ordenador = new Ordenador("HP", "Pavilion", 799.99, "Portátil");
    
            // Imprimir información del Smartphone
            System.out.println("Información del Smartphone:");
            System.out.println("Marca: " + smartphone.getMarca());
            System.out.println("Modelo: " + smartphone.getModelo());
            System.out.println("Precio: $" + smartphone.getPrecio());
            System.out.println("Sistema Operativo: " + smartphone.getSistemaOperativo());
    
            System.out.println();
    
            // Imprimir información del Ordenador
            System.out.println("Información del Ordenador:");
            System.out.println("Marca: " + ordenador.getMarca());
            System.out.println("Modelo: " + ordenador.getModelo());
            System.out.println("Precio: $" + ordenador.getPrecio());
            System.out.println("Tipo: " + ordenador.getTipo());
        }
    }



