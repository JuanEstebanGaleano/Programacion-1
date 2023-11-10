import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class PlantaTest {

    @Test
    void testGetNombreComun() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        assertEquals("nombreComun", planta.getNombreComun());
    }

    @Test
    void testSetNombreComun() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        planta.setNombreComun("newNombreComun");
        assertEquals("newNombreComun", planta.getNombreComun());
    }

    @Test
    void testGetNombreCientifico() {

        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        assertEquals("nombreCientifico", planta.getNombreCientifico());
    }

    @Test
    void testSetNombreCientifico() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        planta.setNombreCientifico("newNombreCientifico");
        assertEquals("newNombreCientifico", planta.getNombreCientifico());
    }

    @Test
    void testGetTipo() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        assertEquals("tipo", planta.getTipo());
    }

    @Test
    void testSetTipo() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        planta.setTipo("newTipo");
        assertEquals("newTipo", planta.getTipo());
    }

    @Test
    void testGetRequerimientos() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        assertEquals("requerimientos", planta.getRequerimientos());
    }

    @Test
    void testSetCuidadosEspecificos() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        planta.setCuidadosEspecificos("newCuidadosEspecificos");
        assertEquals("newCuidadosEspecificos", planta.getCuidadosEspecificos());
    }

    @Test
    void testGetFechaRiego() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        assertNull(planta.getFechaRiego());
    }

    @Test
    void testSetFechaRiego() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        Date fechaRiego = new Date();
        planta.setFechaRiego(fechaRiego);
        assertEquals(fechaRiego, planta.getFechaRiego());
    }

    @Test
    void testToString() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos");
        String expected = "Nombre común: nombreComun\n" +
                          "Nombre científico: nombreCientifico\n" +
                          "Tipo: tipo\n" +
                          "Requerimientos: requerimientos\n" +
                          "Cuidados específicos: cuidadosEspecificos\n";
        assertEquals(expected, planta.toString());
    }

    @Test
    void testRealizarCuidado() {
        Planta planta = new Planta("nombreComun", "nombreCientifico", "tipo", "requerimientos", "cuidadosEspecificos") {
            @Override
            public String realizarCuidado() {
                return "Realizando cuidado";
            }
        };
        assertEquals("Realizando cuidado", planta.realizarCuidado());
    }

}
