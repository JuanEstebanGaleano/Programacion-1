import javax.swing.JOptionPane;

 class CalcularElPromedio{
    public static void main(String[] args) {
          double est1,est2;

    est1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la primera estatura"));
    est2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la segunda estatura"));
    double result=(est1+est2)/2;
    JOptionPane.showMessageDialog(null,"El promedio de estatura entre dos personas: "+result);
    }
  
    
}