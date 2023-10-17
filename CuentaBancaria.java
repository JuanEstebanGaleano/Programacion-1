 class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // El saldo se inicializa en cero
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de $" + cantidad + " realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("No se puede depositar una cantidad negativa o cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("No se puede retirar una cantidad negativa o mayor que el saldo disponible.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public class cuentaBancaria{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "12345");
        
        cuenta.depositar(1000);
        cuenta.retirar(500);
        
        System.out.println("Saldo actual de la cuenta de " + cuenta.getTitular() + ": $" + cuenta.consultarSaldo());
    }
    }
    
}