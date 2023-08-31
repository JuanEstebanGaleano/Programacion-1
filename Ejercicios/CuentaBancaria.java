class CuentaBancaria{
    String titular;
    Double balance;
    CuentaBancaria(String titular, Double balance){
        this.titular= titular;
        this.balance=balance;
    }
    public void Depositar(double cantidad){
    balance+=cantidad;
    }
    public void retirar(double cantidad){
        if(cantidad<=balance){
        balance-=cantidad;
        }else{
            System.out.println("No tiene suficiente saldo");
        }
    }
    public static void main(String[] args) {
    }
}