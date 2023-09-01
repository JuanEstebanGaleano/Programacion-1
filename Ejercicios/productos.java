// Definición de la clase Producto
public class productos {
    // Atributos de la clase
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor de la clase
    public productos(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método para realizar una compra y aumentar el stock
    public void comprar(int cantidad) {
        if (cantidad > 0) {
            cantidadEnStock += cantidad;
            System.out.println(cantidad + " unidades de " + nombre + " compradas.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    // Método para realizar una venta y disminuir el stock
    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println(cantidad + " unidades de " + nombre + " vendidas.");
        } else {
            System.out.println("No hay suficientes unidades en stock para realizar la venta.");
        }
    }

    // Método para obtener información del producto
    public String obtenerInformación() {
        String información = "Nombre: " + nombre + "\n";
        información += "Precio: $" + precio + "\n";
        información += "Cantidad en Stock: " + cantidadEnStock;

        return información;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Producto
        productos miProducto = new productos("Monastery ", 300.000, 50);

        // Comprar y vender unidades del producto
        miProducto.comprar(20);
        miProducto.vender(10);

        // Obtener y mostrar la información del producto
        String informaciónProducto = miProducto.obtenerInformación();
        System.out.println("Información del Producto:\n" + informaciónProducto);
    }
}
