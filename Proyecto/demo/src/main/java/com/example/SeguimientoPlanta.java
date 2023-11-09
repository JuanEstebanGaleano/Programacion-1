package com.example;
import java.util.ArrayList;
import java.util.Date;

public class SeguimientoPlanta {
    private ArrayList<RegistroCuidado> registros;

    public SeguimientoPlanta() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(RegistroCuidado registro) {
        registros.add(registro);
    }

    public void alertaProximosCuidados(Planta planta) {
        Date hoy = new Date();
        for (RegistroCuidado registro : registros) {
            if (registro.getFecha().after(hoy)) {
                System.out.println("Próximo cuidado para la planta " + planta.getNombreComun() + ": " +
                        registro.getTipoCuidado() + " el " + registro.getFecha());
            }
        }
    }

}
