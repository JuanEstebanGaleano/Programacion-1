import javax.swing.JOptionPane;
public class CalcularElValorDeunaVenta {
    public static void main(String[] args) {
        double precio;
        int cantidad;
  precio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio del producto"));
  cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos"));
  double valorPagar=precio*cantidad;
  if (cantidad<=10) {
      JOptionPane.showMessageDialog(null,"El valor de la venta es: $"+valorPagar);
  } else {
    double descuento=valorPagar*0.10;
    double total=valorPagar-descuento;
      JOptionPane.showMessageDialog(null,"El valor de la venta con su descuento del 10% es: $"+total);
    }
  }
}
