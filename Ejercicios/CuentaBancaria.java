public class CuentaBancaria {
    String titularCuenta;
    double balance;

    // Constructor
    CuentaBancaria(String titularCuenta, double balance) {
        this.titularCuenta = titularCuenta;
        this.balance = balance;
    }
    // Método para depositar dinero en la cuenta
     public void  Depositar(double cantidad) {
        balance += cantidad;
    }
    // Método para retirar dinero de la cuenta
    public void Retirar(double cantidad) {
        if (cantidad <= balance) {
            balance -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo en la cuenta.");
        }
    }

    // Método para obtener el balance actual de la cuenta
   public double obtenerBalance() {
        return balance;
    }
}
