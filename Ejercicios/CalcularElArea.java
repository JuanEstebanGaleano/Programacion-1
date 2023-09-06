import javax.swing.JOptionPane;
import java.lang.Math;
public class CalcularElArea {
    public static void main(String[] args) {
        double radio;
        radio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el radio del circulo"));
        double area=Math.PI*Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"El área del circulo: "+radio+" radio "+area);
    }
}
