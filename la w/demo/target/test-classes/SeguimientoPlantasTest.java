import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SeguimientoPlantasTest {

    @Test
    void testRealizarSeguimiento() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        String herramientaUtilizada = planta.realizarSeguimiento();
        assertEquals("Herramienta no reconocida", herramientaUtilizada);
    }

    @Test
    void testMostrarSeguimiento() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        planta.mostrarSeguimiento();
    }

    @Test
    void testGetSeguimientoDelEstadoSalud() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        assertEquals("Saludable", planta.getSeguimientoDelEstadoSalud());
    }

    @Test
    void testSetSeguimientoDelEstadoSalud() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        planta.setSeguimientoDelEstadoSalud("Enferma");
        assertEquals("Enferma", planta.getSeguimientoDelEstadoSalud());
    }

    @Test
    void testGetSeguimientoDelCrecimiento() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        assertEquals("Creciendo bien", planta.getSeguimientoDelCrecimiento());
    }

    @Test
    void testSetSeguimientoDelCrecimiento() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        planta.setSeguimientoDelCrecimiento("No crece");
        assertEquals("No crece", planta.getSeguimientoDelCrecimiento());
    }

    @Test
    void testGetHerramientas() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        assertEquals("Herramientas", planta.getHerramientas());
    }

    @Test
    void testSetHerramientas() {
        SeguimientoPlantas planta = new SeguimientoPlantas("Saludable", "Creciendo bien", "Herramientas");
        planta.setHerramientas("Otras herramientas");
        assertEquals("Otras herramientas", planta.getHerramientas());
    }
}
