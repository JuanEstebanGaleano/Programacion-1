
   public  class cuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public cuentaBancaria() {
    }

    public cuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0; // No se permite un saldo negativo, establecemos a 0.
        }
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No tiene suficiente saldo o la cantidad es negativa.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaBancaria("Juan", 10000.0, "56289328921");
        cuenta.consultarSaldo();
        cuenta.depositar(2000.0);
        cuenta.retirar(5000.0);
        cuenta.consultarSaldo();
    }
    }

    
    
