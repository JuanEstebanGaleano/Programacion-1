import javax.swing.JOptionPane;
public class MesDelAño {
    public static void main(String[] args) {
        int mes;
        mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número del mes que desea averiguar "));
        switch (mes) {
        case 1:JOptionPane.showMessageDialog(null,"Enero"); 
        break;
        case 2:JOptionPane.showMessageDialog(null,"Febrero");
        break;
        case 3:JOptionPane.showMessageDialog(null,"Marzo");
        break;
        case 4:JOptionPane.showMessageDialog(null,"Abril");
        break;
        case 5:JOptionPane.showMessageDialog(null,"Mayo");
        break;
        case 6:JOptionPane.showMessageDialog(null,"Junio");
        break;
        case 7:JOptionPane.showMessageDialog(null,"Julio");
        break;
        case 8:JOptionPane.showMessageDialog(null,"Agosto");
        break;
        case 9:JOptionPane.showMessageDialog(null,"Septiembre");
        break;
        case 10:JOptionPane.showMessageDialog(null,"Octubre");
        break;
        case 11:JOptionPane.showMessageDialog(null,"Noviembre");
        break;
        case 12:JOptionPane.showMessageDialog(null,"Diciembre");
        default:
        break;
       }
    }
}
