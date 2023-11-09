package com.example;
mport java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class planta{


// Clase abstracta para representar plantas
abstract class Planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientos;
    private String cuidadosEspecificos;
    private Date fechaRiego;

    public Planta(String nombreComun, String nombreCientifico, String tipo, String requerimientos, String cuidadosEspecificos) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientos = requerimientos;
        this.cuidadosEspecificos = cuidadosEspecificos;
        this.fechaRiego = null;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setCuidadosEspecificos(String cuidadosEspecificos) {
        this.cuidadosEspecificos = cuidadosEspecificos;
    }

    public Date getFechaRiego() {
        return fechaRiego;
    }

    public void setFechaRiego(Date fechaRiego) {
        this.fechaRiego = fechaRiego;
    }

    public abstract String realizarCuidado();

    @Override
    public String toString() {
        return "Nombre común: " + nombreComun + "\n" +
               "Nombre científico: " + nombreCientifico + "\n" +
               "Tipo: " + tipo + "\n" +
               "Requerimientos: " + requerimientos + "\n" +
               "Cuidados específicos: " + cuidadosEspecificos + "\n";
    }
}

// Clase concreta que hereda de Planta
class Rosa extends Planta {
    public Rosa(String nombreComun, String nombreCientifico, String tipo, String requerimientos, String cuidadosEspecificos) {
        super(nombreComun, nombreCientifico, tipo, requerimientos, cuidadosEspecificos);
    }

    @Override
    public String realizarCuidado() {
        return "Cuidado específico para rosas";
    }
}

// Clase abstracta para representar botánicos
abstract class Botanico {
    private String licenciaBotanico;
    private String nombre;
    private String apellido;
    private String email;
    private String numeroCelular;

    public Botanico(String licenciaBotanico, String nombre, String apellido, String email, String numeroCelular) {
        this.licenciaBotanico = licenciaBotanico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public abstract void agregarCuidado(CuidadoPlanta cuidado);

    public abstract void actualizarCuidado(CuidadoPlanta cuidado);

    public abstract void eliminarCuidado(CuidadoPlanta cuidado);

    public abstract List<CuidadoPlanta> obtenerCuidados();

    @Override
    public String toString() {
        return "Licencia de botánico: " + licenciaBotanico + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Email: " + email + "\n" +
               "Número de celular: " + numeroCelular + "\n";
    }
}

// Clase concreta que hereda de Botanico
class BotanicoEspecializado extends Botanico {
    private List<CuidadoPlanta> cuidados;

    public BotanicoEspecializado(String licenciaBotanico, String nombre, String apellido, String email, String numeroCelular) {
        super(licenciaBotanico, nombre, apellido, email, numeroCelular);
        cuidados = new ArrayList<>();
    }

    @Override
    public void agregarCuidado(CuidadoPlanta cuidado) {
        cuidados.add(cuidado);
    }

    @Override
    public void actualizarCuidado(CuidadoPlanta cuidado) {
        // Implementar la actualización del cuidado
    }

    @Override
    public void eliminarCuidado(CuidadoPlanta cuidado) {
        cuidados.remove(cuidado);
    }

    @Override
    public List<CuidadoPlanta> obtenerCuidados() {
        return cuidados;
    }
}

// Clase para representar cuidados de las plantas
class CuidadoPlanta {
    private String areaCuidado;
    private Date fechaHoraCuidado;
    private List<Botanico> botanicos;
    private String resultadoCuidado;
    private String estadoCuidado;

    public CuidadoPlanta(String areaCuidado, Date fechaHoraCuidado) {
        this.areaCuidado = areaCuidado;
        this.fechaHoraCuidado = fechaHoraCuidado;
        this.botanicos = new ArrayList<>();
        this.resultadoCuidado = "";
        this.estadoCuidado = "PENDIENTE";
    }

    public String getAreaCuidado() {
        return areaCuidado;
    }

    public Date getFechaHoraCuidado() {
        return fechaHoraCuidado;
    }

    public void agregarBotanico(Botanico botanico) {
        botanicos.add(botanico);
    }

    public void registrarResultadoCuidado(String resultado) {
        resultadoCuidado = resultado;
        estadoCuidado = "FINALIZADO";
    }

    public void aplazarCuidado() {
        estadoCuidado = "APLAZADO";
    }

    public String getEstadoCuidado() {
        return estadoCuidado;
    }
}

}

       