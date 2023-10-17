package celular;
public class Smartphone extends Dispositivos {
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}