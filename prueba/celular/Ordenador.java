package celular;

public class Ordenador extends Dispositivos {
    private String tipo;

    public Ordenador(String marca, String modelo, double precio, String tipo) {
        super(marca, modelo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}