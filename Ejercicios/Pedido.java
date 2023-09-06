// Definición de la clase Pedido
public class Pedido {
    // Atributos de la clase
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;

    // Constructor de la clase
    public Pedido(String nombreProducto, int cantidad, double precioUnitario) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Método para calcular el precio total del pedido
    public double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Pedido
        Pedido miPedido = new Pedido("Camiseta", 5, 15.99);

        // Calcular y mostrar el precio total del pedido
        double precioTotal = miPedido.calcularPrecioTotal();
        System.out.println("Pedido: " + miPedido.nombreProducto);
        System.out.println("Cantidad: " + miPedido.cantidad);
        System.out.println("Precio Unitario: $" + miPedido.precioUnitario);
        System.out.println("Precio Total del Pedido: $" + precioTotal);
    }
}

