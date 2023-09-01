public class CuentaBancaria{
    String titular;
    static Double balance;
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
    public static double obtenerBalance(){
        return balance;
    }
    public static void main(String[] args) {
        CuentaBancaria p= new CuentaBancaria("Juan", 10000.0);
        CuentaBancaria.obtenerBalance();
        System.out.println(CuentaBancaria.obtenerBalance());
    }
}