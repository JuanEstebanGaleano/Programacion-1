// Definición de la clase Fecha
public class Fecha {
    // Atributos de la clase
    private int día;
    private int mes;
    private int año;

    // Constructor de la clase
    public Fecha(int día, int mes, int año) {
        this.día = día;
        this.mes = mes;
        this.año = año;
    }

    // Método para mostrar la fecha en formato DD/MM/AAAA
    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%04d%n", día, mes, año);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de Fecha
        Fecha miFecha = new Fecha(31, 8, 2023);

        // Mostrar la fecha en formato DD/MM/AAAA
        System.out.print("Fecha: ");
        miFecha.mostrarFecha();
    }
}
