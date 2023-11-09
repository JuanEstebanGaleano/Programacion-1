package com.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    public String getResultadoCuidado() {
        return resultadoCuidado;
    }
    public void setResultadoCuidado(String resultadoCuidado) {
        this.resultadoCuidado = resultadoCuidado;
    }
}