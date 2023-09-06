import javax.swing.JOptionPane;
public class MostrarElPromedioDeEdades {
    public static void main(String[] args) {
        int edad1,edad2;

  edad1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la primera edad"));
  edad2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la segunda edad"));
  int result=(edad1+edad2)/2;
  JOptionPane.showMessageDialog(null,"El promedio de las edades entre dos personas: "+result);
  }
}
