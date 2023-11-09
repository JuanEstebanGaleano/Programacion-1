package com.example;
import java.util.ArrayList;
import java.util.List;

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