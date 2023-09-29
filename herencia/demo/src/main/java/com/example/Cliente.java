package herencia.demo.src.main.java.com.example;
import java.util.Date;
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int ContadorClientes;

    public Cliente(Date fechaRegistro, boolean vip){
        this.idCliente=++ContadorClientes;
    }
}
